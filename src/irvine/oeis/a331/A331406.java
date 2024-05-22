package irvine.oeis.a331;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A331406 Array read by antidiagonals: A(n,m) is the number of ways to place non-adjacent counters on the black squares of a 2n-1 X 2m-1 checker board.
 * @author Sean A. Irvine
 */
public class A331406 extends Sequence0 {

  // After Andrew Howroyd

  private int mN = -1;
  private int mM = 0;

  private Z[] step1(final Z[] v) {
    final Z[] res = new Z[v.length / 2];
    for (int i = 0; i < res.length; ++i) {
      Z s = Z.ZERO;
      for (int j = 0; j < v.length; ++j) {
        if ((i & (j | (j >>> 1))) == 0) {
          s = s.add(v[j]);
        }
      }
      res[i] = s;
    }
    return res;
  }

  private Z[] step2(final Z[] v) {
    final Z[] res = new Z[v.length * 2];
    for (int i = 0; i < res.length; ++i) {
      Z s = Z.ZERO;
      for (int j = 0; j < v.length; ++j) {
        if ((i & (j | (j << 1))) == 0) {
          s = s.add(v[j]);
        }
      }
      res[i] = s;
    }
    return res;
  }

  protected Z t(final int n, final int k) {
    if (n == 0 || k == 0) {
      return Z.ONE;
    }
    Z[] v = new Z[1 << k];
    Arrays.fill(v, Z.ONE);
    for (int j = 1; j < n; ++j) {
      v = step2(step1(v));
    }
    return Functions.SUM.z(v);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM);
  }
}
