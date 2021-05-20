package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001764;

/**
 * A047769 Number of dissectable polyhedra with symmetry of type M.
 * @author Sean A. Irvine
 */
public class A047769 extends A001764 {

  {
    super.next();
  }
  private final Sequence mA = new A047764();
  private final Sequence mB = new A047765();
  private final Sequence mC = new A047766();
  private boolean mOdd = false;

  @Override
  public Z next() {
    final Z t = mA.next().add(mB.next()).add(mC.next().multiply2());
    mOdd = !mOdd;
    return mOdd ? Z.ZERO : super.next().subtract(t).divide2();
  }
}
