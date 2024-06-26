package irvine.oeis.a349;
// Generated by gen_seq4.pl anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A349378 a(n) = A349376(n) + A349377(n).
 * @author Georg Fischer
 */
public class A349378 extends AbstractSequence {

  private final A349376 mSeq1 = new A349376();
  private final A349377 mSeq2 = new A349377();

  /** Construct the sequence. */
  public A349378() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq2.next());
  }
}
