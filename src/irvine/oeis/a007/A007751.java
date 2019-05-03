package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007751 Even bisection of <code>A007750</code>.
 * @author Sean A. Irvine
 */
public class A007751 extends A007750 {

  @Override
  public Z next() {
    final Z t = super.next();
    super.next();
    return t;
  }
}

