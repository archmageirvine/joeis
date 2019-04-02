package irvine.oeis.a078;

import irvine.math.z.Z;

/**
 * A078277 a(n) = A078274(n)/11.
 * @author Sean A. Irvine
 */
public class A078277 extends A078274 {

  @Override
  public Z next() {
    return super.next().divide(11);
  }
}

