package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005663;
import irvine.oeis.a005.A005664;

/**
 * A046102 Denominators of convergents to the comma of Pythagoras.
 * @author Sean A. Irvine
 */
public class A046102 extends A005663 {

  private final Sequence mD = new A005664();

  {
    next(); // skip 0th
  }

  @Override
  public Z next() {
    return super.next().subtract(mD.next());
  }
}
