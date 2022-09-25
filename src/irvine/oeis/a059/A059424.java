package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002135;

/**
 * A059424 Number of negative terms in a symmetric determinant of order n.
 * @author Sean A. Irvine
 */
public class A059424 extends A059422 {

  private final Sequence mA = new A002135();

  @Override
  public Z next() {
    return mA.next().subtract(super.next()).divide2();
  }
}
