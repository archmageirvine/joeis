package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A083113 a(n) = (A083112(n) + 1)/n.
 * @author Sean A. Irvine
 */
public class A083113 extends AbstractSequence {

  private long mN = 0;

  private final A083112 mSeq = new A083112();

  /** Construct the sequence. */
  public A083113() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next().add(1).divide(++mN);
  }
}

