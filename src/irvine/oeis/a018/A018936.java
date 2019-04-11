package irvine.oeis.a018;

import irvine.math.z.Z;

/**
 * A018936 Consider smallest m such that m^2 <code>= x1^2 + ... + xn^2</code> with <code>0 &lt; x1 &lt; ... &lt; xn.</code> Sequence gives values of m^2.
 * @author Sean A. Irvine
 */
public class A018936 extends A018935 {

  @Override
  public Z next() {
    return super.next().square();
  }
}

