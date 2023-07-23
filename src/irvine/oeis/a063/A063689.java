package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a058.A058870;

/**
 * A063689 Number of 2-trees rooted at a triangle with 3 similar edges.
 * @author Sean A. Irvine
 */
public class A063689 extends AbstractSequence {

  private final A063687 mSeq1 = new A063687();

  /** Construct the sequence. */
  public A063689() {
    super(1);
  }

  private int mN = -1;
  private final Sequence mXSeq = new A058870();

  @Override
  public Z next() {
    ++mN;
    return mSeq1.next().add(mN > 0 ? mXSeq.next() : Z.ZERO);
  }
}

