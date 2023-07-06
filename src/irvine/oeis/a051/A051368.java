package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000918;
import irvine.oeis.a036.A036239;

/**
 * A051368 Number of Boolean functions of n variables and rank 8 from the Post class F(5,2).
 * @author Sean A. Irvine
 */
public class A051368 extends Sequence1 {

  // A051184(n)-A051183(n)+A051182(n)-A051181(n)+A051180(n)-A036239(n)+A000918(n)
  private final Sequence mA = new A051184().skip(1);
  private final Sequence mB = new A051183().skip(1);
  private final Sequence mC = new A051182().skip(1);
  private final Sequence mD = new A051181().skip(1);
  private final Sequence mE = new A051180().skip(1);
  private final Sequence mF = new A036239();
  private final Sequence mG = new A000918().skip(1);

  @Override
  public Z next() {
    return mA.next()
      .subtract(mB.next())
      .add(mC.next())
      .subtract(mD.next())
      .add(mE.next())
      .subtract(mF.next())
      .add(mG.next());
  }
}
