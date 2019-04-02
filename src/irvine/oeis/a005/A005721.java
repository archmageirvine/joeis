package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005721 Central quadrinomial coefficients.
 * @author Sean A. Irvine
 */
public class A005721 extends A005190 {

  @Override
  public Z next() {
    final Z t = super.next();
    super.next();
    return t;
  }
}

