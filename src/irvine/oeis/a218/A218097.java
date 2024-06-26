package irvine.oeis.a218;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a210.A210914;
import irvine.oeis.a210.A210915;

/**
 * A218097 Number of transitive reflexive early confluent binary relations R on n labeled elements with max_{x}(|{y : xRy}|) = 7.
 * @author Georg Fischer
 */
public class A218097 extends AbstractSequence {

  private final A210915 mSeq1 = new A210915();
  private final A210914 mSeq2 = new A210914();

  /** Construct the sequence. */
  public A218097() {
    super(7);
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    mSeq2.next();
    mSeq2.next();
    mSeq2.next();
    mSeq2.next();
    mSeq2.next();
    mSeq2.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
