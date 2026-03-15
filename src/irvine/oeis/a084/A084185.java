package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a004.A004539;

/**
 * A084185 First occurrence of binary n in the binary expansion of sqrt(2).
 * @author Sean A. Irvine
 */
public class A084185 extends AbstractSequence {

  private final StringBuilder mS = new StringBuilder();
  private final Sequence mSeq;
  private long mN = 0;

  protected A084185(final int offset, final Sequence seq) {
    super(offset);
    mSeq = seq;
    mN = offset - 1;
  }

  /** Construct the sequence. */
  public A084185() {
    this(1, new A004539());
  }

  @Override
  public Z next() {
    final String s = Long.toBinaryString(++mN);
    int pos;
    while ((pos = mS.indexOf(s)) < 0) {
      // Roughly double length each time we fail to find
      final int end = Math.max(1, mS.length() * 2);
      for (int k = 0; k < end; ++k) {
        mS.append(mSeq.next());
      }
    }
    return Z.valueOf(pos + 1);
  }
}

