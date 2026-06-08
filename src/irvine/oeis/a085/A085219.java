package irvine.oeis.a085;

import java.util.List;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A085219 Array A(x,y): "rised concatenation" of factorial expansions of x &amp; y, listed antidiagonalwise as A(0,0), A(1,0), A(0,1), A(2,0), A(1,1), A(0,2), ... Zero is expanded as an empty string.
 * @author Sean A. Irvine
 */
public class A085219 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  protected Z t(final int n, final int m) {
    if (n == 0) {
      return Z.valueOf(m);
    }
    if (m == 0) {
      return Z.valueOf(n);
    }
    final List<Z> nf = ZUtils.factorialBaseList(Z.valueOf(n));
    final List<Z> mf = ZUtils.factorialBaseList(Z.valueOf(m));
    Z res = Z.ZERO;
    int j = 1;
    for (int k = mf.size() - 1; k >= 0; --k) {
      res = res.add(mf.get(k).multiply(Functions.FACTORIAL.z(j++)));
    }
    final Z d = mf.get(0);
    for (int k = nf.size() - 1; k >= 0; --k) {
      res = res.add(nf.get(k).add(d).multiply(Functions.FACTORIAL.z(j++)));
    }
    return res;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM);
  }
}
