package irvine.oeis.a060;

import java.util.ArrayList;
import java.util.List;

import irvine.math.IntegerUtils;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.set.IntegerPermutation;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060117 A list of all finite permutations in "PermUnrank3R" ordering. (Inverses of the permutations of A060118.).
 * @author Sean A. Irvine
 */
public class A060117 extends Sequence0 {

  private IntegerPermutation mA = new IntegerPermutation();
  private int mN = -1;
  private int mM = 0;

  private List<Long> factorialBase(long n) {
    final ArrayList<Long> res = new ArrayList<>();
    long f = 2;
    int k = 2;
    while (f <= n) {
      f *= ++k;
    }
    while (k > 1) {
      f /= k--;
      final long q = n / f;
      res.add(q);
      n -= q * f;
    }
    return res;
  }

  private IntegerPermutation permUnrank3RAux(final int n, final int r, final IntegerPermutation p) {
    if (r == 0) {
      return p;
    }
    final int f = MemoryFactorial.SINGLETON.factorial(n - 1).intValueExact();
    final int s = r / f;
    final int[] q = IntegerUtils.identity(new int[n]);
    q[n - 1] = n - s - 1;
    q[n - s - 1] = n - 1;
    return permUnrank3RAux(n - 1, r - s * f, new IntegerPermutation(q).compose(p));
  }

  IntegerPermutation permUnrank3R(final int r) {
    final int n = factorialBase(r).size();
    return permUnrank3RAux(n + 1, r, new IntegerPermutation());
  }

  @Override
  public Z next() {
    if (++mM >= mA.size()) {
      mM = 0;
      mA = permUnrank3R(++mN);
    }
    return Z.valueOf(mA.image(mM) + 1);
  }
}
