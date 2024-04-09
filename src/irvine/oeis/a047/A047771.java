package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001764;

/**
 * A047771 Number of dissectable polyhedra with n tetrahedral cells and symmetry of type L.
 * @author Sean A. Irvine
 */
public class A047771 extends A001764 {

  /** Construct the sequence. */
  public A047771() {
    super(1);
  }

  {
    super.next();
  }

  private final Sequence mA = new A047764();
  private final Sequence mB = new A047765();
  private final Sequence mC = new A047766();
  private boolean mOdd = false;

  @Override
  public Z next() {
    final Z t = mA.next().add(mB.next().multiply(3)).add(mC.next().multiply2());
    mOdd = !mOdd;
    return mOdd ? Z.ZERO : super.next().subtract(t).divide(6);
  }
}

