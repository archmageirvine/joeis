package irvine.oeis.a018;

import irvine.math.z.Z;

/**
 * A018936 Consider smallest m such that <code>m^2 = x1^2 +</code> ... <code>+ xn^2</code> with <code>0 &lt; x1 &lt</code>; ... <code>&lt</code>; xn. Sequence gives values of <code>m^2</code>.
 * @author Sean A. Irvine
 */
public class A018936 extends A018935 {

  @Override
  public Z next() {
    return super.next().square();
  }
}

