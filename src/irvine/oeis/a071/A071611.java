package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005875;

/**
 * A071563.
 * @author Sean A. Irvine
 */
public class A071611 extends Sequence1 {

  private final Sequence mA = new A071609();
  private final DirectSequence mB = DirectSequence.create(new A005875());

  @Override
  public Z next() {
    return mB.a(mA.next());
  }
}
