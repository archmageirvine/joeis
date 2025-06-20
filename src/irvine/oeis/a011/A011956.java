package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a371.A371992;

/**
 * A011956 Number of close-packings with layer-number 3n and space group R3m.
 * @author Sean A. Irvine
 */
public class A011956 extends AbstractSequence {

  private final Sequence mS = new A371992().skip(6);
  private final Sequence mB = new A011954().skip(3);
  private final DirectSequence mC = DirectSequence.create(new A011955());
  private int mN = 6;

  /** Construct the sequence. */
  public A011956() {
    super(7);
  }

  @Override
  public Z next() {
    ++mN;
    final Z t = (mN & 1) == 0 ? mC.a(mN / 2).add(mC.a(mN / 2 - 1)) : mB.next();
    return mS.next().subtract(t);
  }
}
