package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005731.
 * @author Sean A. Irvine
 */
public class A005731 extends A005729 {

  private final A005730 mA = new A005730();

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
