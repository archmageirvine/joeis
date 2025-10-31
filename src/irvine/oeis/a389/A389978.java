package irvine.oeis.a389;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a367.A367865;
import irvine.oeis.a367.A367866;

/**
 * A389978 Arithmetic mean of A367866(n), A389977(n), A367865(n), and A389775(n).
 * @author Sean A. Irvine
 */
public class A389978 extends Sequence1 {

  private final Sequence mA = new A367865();
  private final Sequence mB = new A367866();
  private final Sequence mC = new A389775();
  private final Sequence mD = new A389977();

  @Override
  public Z next() {
    return mA.next().add(mB.next()).add(mC.next()).add(mD.next()).divide(4);
  }
}

