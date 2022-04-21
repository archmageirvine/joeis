package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002729;

/**
 * A056419 Number of step cyclic shifted sequences using exactly six different symbols.
 * @author Sean A. Irvine
 */
public class A056419 implements Sequence {

  private final Sequence mA = new A056414();
  private final Sequence mB = new A056413();
  private final Sequence mC = new A056412();
  private final Sequence mD = new A056411();
  private final Sequence mE = new A002729();
  {
    mE.next();
  }

  @Override
  public Z next() {
    return mA.next()
      .subtract(mB.next().multiply(6))
      .add(mC.next().multiply(15))
      .subtract(mD.next().multiply(20))
      .add(mE.next().multiply(15))
      .subtract(6);
  }
}
