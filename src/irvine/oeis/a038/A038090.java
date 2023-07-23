package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * A038090 Number of n-node rooted identity trees of height 6.
 * @author Sean A. Irvine
 */
public class A038090 extends AbstractSequence {

  private final A038085 mSeq1 = new A038085();

  /** Construct the sequence. */
  public A038090() {
    super(7);
  }

  private final Sequence mA = new A038084();

  {
    for (int k = 0; k < 6; ++k) {
      next();
    }
  }

  @Override
  public Z next() {
    final Z u = mSeq1.next();
    if (u == null) {
      return null;
    }
    final Z t = mA.next();
    return t == null ? u : u.subtract(t);
  }
}
