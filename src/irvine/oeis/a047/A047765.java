package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047765 Number of dissectable polyhedra with symmetry of type P.
 * @author Sean A. Irvine
 */
public class A047765 extends A047749 {

  {
    super.next();
  }
  private final Sequence mA = new A047764();
  private boolean mOdd = false;

  @Override
  public Z next() {
    final Z a = mA.next();
    mOdd = !mOdd;
    return mOdd ? Z.ZERO : super.next().subtract(a);
  }
}
