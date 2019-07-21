package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024715.
 * @author Sean A. Irvine
 */
public class A024715 extends A024702 {

  private static final Z ELEVEN = Z.valueOf(11);

  @Override
  public Z next() {
    return super.next().mod(ELEVEN);
  }
}
