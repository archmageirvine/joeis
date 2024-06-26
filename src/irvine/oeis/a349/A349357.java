package irvine.oeis.a349;
// Generated by gen_seq4.pl anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A349357 a(n) = A349355(n) + A349356(n).
 * @author Georg Fischer
 */
public class A349357 extends AbstractSequence {

  private final A349355 mSeq1 = new A349355();
  private final A349356 mSeq2 = new A349356();

  /** Construct the sequence. */
  public A349357() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq2.next());
  }
}
