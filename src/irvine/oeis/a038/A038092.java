package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * A038092 Number of n-node rooted identity trees of height 8.
 * @author Sean A. Irvine
 */
public class A038092 extends AbstractSequence {

  private final A038087 mSeq1 = new A038087();

  /** Construct the sequence. */
  public A038092() {
    super(9);
  }

  private final Sequence mA = new A038086();

  {
    for (int k = 0; k < 8; ++k) {
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
