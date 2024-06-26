package irvine.oeis.a172;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a027.A027641;
import irvine.oeis.a164.A164555;

/**
 * A172298 a(n) = A027641(n) * A164555(n).
 * @author Georg Fischer
 */
public class A172298 extends AbstractSequence {

  private final A027641 mSeq1 = new A027641();
  private final A164555 mSeq2 = new A164555();

  /** Construct the sequence. */
  public A172298() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mSeq2.next());
  }
}
