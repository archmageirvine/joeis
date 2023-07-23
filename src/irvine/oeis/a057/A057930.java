package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A057930 Sequence b(n) mentioned in A057929.
 * @author Sean A. Irvine
 */
public class A057930 extends AbstractSequence {

  private final A057929 mSeq1 = new A057929();

  /** Construct the sequence. */
  public A057930() {
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
