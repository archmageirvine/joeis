package irvine.oeis.a093;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000071;
import irvine.oeis.a000.A000079;
import irvine.oeis.a092.A092176;

/**
 * A083659.
 * @author Sean A. Irvine
 */
public class A093304 extends Sequence1 {

  private final Sequence mA = new A000071().skip();
  private final Sequence mB = new A000079();
  private final Sequence mC = new A092176();

  @Override
  public Z next() {
    return mA.next().add(mB.next()).subtract(mC.next());
  }
}
