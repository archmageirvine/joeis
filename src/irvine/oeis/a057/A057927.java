package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A057927 Sequence b(n) mentioned in A057926.
 * @author Sean A. Irvine
 */
public class A057927 extends AbstractSequence {

  private final A057926 mSeq1 = new A057926();

  /** Construct the sequence. */
  public A057927() {
    super(1);
  }

  private Z mA = mSeq1.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mSeq1.next();
    return t.or(mA);
  }
}
