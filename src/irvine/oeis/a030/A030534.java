package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a026.A026106;
import irvine.oeis.a026.A026118;
import irvine.oeis.a026.A026298;

/**
 * A030534 Number of polyhexes of class PF2.
 * @author Sean A. Irvine
 */
public class A030534 extends AbstractSequence {

  /* Construct the sequence. */
  public A030534() {
    super(4);
  }

  private final Sequence mA = new A026106();
  private final Sequence mB = new PrependSequence(new A026118(), 0);
  private final Sequence mC = new PrependSequence(new A026298(), 0, 0);
  private final Sequence mD = new PrependSequence(new A030519(), 0, 0, 0);
  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return mA.next().add(mB.next()).add(mC.next()).add(mD.next());
  }
}
