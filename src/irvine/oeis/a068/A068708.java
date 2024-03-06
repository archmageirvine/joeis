package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000290;

/**
 * A068701.
 * @author Sean A. Irvine
 */
public class A068708 extends Sequence1 {

  private final Sequence mSeq;

  protected A068708(final Sequence seq) {
    mSeq = seq;
  }

  /** Construct the sequence. */
  public A068708() {
    this(new A000290().skip());
  }

  private boolean is(final Z s) {
    final int[] cnts = ZUtils.digitCounts(s);
    int min = Integer.MAX_VALUE;
    int max = 0;
    for (final int v : cnts) {
      if (v < min) {
        min = v;
      }
      if (v > max) {
        max = v;
      }
    }
    if (max - min > 1) {
      return false;
    }
    if (min == max) {
      return true;
    }
    int transitions = cnts[0] == cnts[cnts.length - 1] ? 0 : 1;
    for (int k = 1; k < cnts.length; ++k) {
      if (cnts[k] != cnts[k - 1] && ++transitions > 2) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z s = mSeq.next();
      if (is(s)) {
        return s;
      }
    }
  }
}
