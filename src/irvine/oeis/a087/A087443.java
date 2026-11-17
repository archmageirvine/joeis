package irvine.oeis.a087;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087443 Least integer of each prime signature ordered first by sum of exponents and then by least integer value.
 * @author Sean A. Irvine
 */
public class A087443 extends Sequence0 {

  // After Alois P. Heinz

  private final Fast mPrime = new Fast();
  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = -1;

  private List<Z> b(final long n, final long i, final List<Z> l) {
    if (n == 0) {
      Z prod = Z.ONE;
      Z p = Z.TWO;
      for (final Z v : l) {
        prod = prod.multiply(p.pow(v));
        p = mPrime.nextPrime(p);
      }
      final ArrayList<Z> res = new ArrayList<>();
      res.add(prod);
      return res;
    }
    if (i == 1) {
      final ArrayList<Z> lst = new ArrayList<>(l);
      for (long k = 0; k < n; ++k) {
        lst.add(Z.ONE);
      }
      return b(0, 0, lst);
    }
    final List<Z> lst = b(n, i - 1, l);
    if (i <= n) {
      final ArrayList<Z> copy = new ArrayList<>(l);
      copy.add(Z.valueOf(i));
      lst.addAll(b(n - i, i, copy));
    }
    return lst;
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.addAll(b(++mN, mN, new ArrayList<>()));
    }
    return mA.pollFirst();
  }
}
