package irvine.oeis.a054;

import irvine.math.z.Z;

/**
 * A054019 Square roots of A054018.
 * @author Sean A. Irvine
 */
public class A054019 extends A054018 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
