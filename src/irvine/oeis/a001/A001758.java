package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001758 Number of quasi-alternating permutations of length n.
 * @author Sean A. Irvine
 */
public class A001758 extends AbstractSequence {

  private final A001250 mSeq1 = new A001250();

  /** Construct the sequence. */
  public A001758() {
    super(2);
  }

  {
    mSeq1.next();
    mSeq1.next();
  }

  protected Z mT = mSeq1.next();
  protected Z mA1758;

  @Override
  public Z next() {
    final Z t = mSeq1.next();
    final Z r = t.subtract(mT.multiply2());
    mT = t;
    mA1758 = r;
    return r;
  }
}
