package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000676.
 * @author Sean A. Irvine
 */
public class A000676 extends A000055 {

  private final A000677 mA677 = new A000677();

  @Override
  public Z next() {
    return super.next().subtract(mA677.next());
  }
}
