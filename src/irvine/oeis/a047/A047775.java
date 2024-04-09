package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047775 Number of dissectable polyhedra with n tetrahedral cells and symmetry of type B.
 * @author Sean A. Irvine
 */
public class A047775 extends A047749 {

  /** Construct the sequence. */
  public A047775() {
    super(1);
  }

  {
    super.next();
  }

  private final Sequence mA = new A047773();
  private final Sequence mB = new A047760();
  private final Sequence mC = new A047753();
  private final Sequence mD = new A047751();
  private final Sequence mE = new A047764();
  private final Sequence mF = new A047765();

  @Override
  public Z next() {
    return super.next()
      .subtract(mA.next().multiply2())
      .subtract(mB.next().multiply2())
      .subtract(mC.next())
      .subtract(mD.next())
      .subtract(mE.next())
      .subtract(mF.next())
      .divide2();
  }
}

