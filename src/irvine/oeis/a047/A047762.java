package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047762 Number of dissectable polyhedra with symmetry of type E.
 * @author Sean A. Irvine
 */
public class A047762 extends A047749 {

  /** Construct the sequence. */
  public A047762() {
    super(1);
  }

  {
    super.next();
  }

  private final Sequence mA = new A047760();
  private final Sequence mB = new A047758();
  private final Sequence mC = new A047754();
  private final Sequence mD = new A047753();
  private final Sequence mE = new A047752();
  private final Sequence mF = new A047751();
  private boolean mEven = true;

  @Override
  public Z next() {
    final Z t = super.next().subtract(mA.next().multiply2()
      .add(mB.next().multiply(6))
      .add(mC.next().multiply2())
      .add(mD.next().multiply(3))
      .add(mE.next().multiply2())
      .add(mF.next())
    );
    mEven = !mEven;
    if (mEven) {
      return Z.ZERO;
    } else {
      return t.divide(4);
    }
  }
}
