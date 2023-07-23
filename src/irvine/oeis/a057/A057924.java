package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A057924 Sequence b(n) mentioned in A057923.
 * @author Sean A. Irvine
 */
public class A057924 extends AbstractSequence {

  private final A057923 mSeq1 = new A057923();

  /** Construct the sequence. */
  public A057924() {
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
