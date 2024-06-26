package irvine.oeis.a334;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a056.A056239;
import irvine.oeis.a061.A061395;

/**
 * A334201 a(n) = A056239(n) - A061395(n).
 * @author Georg Fischer
 */
public class A334201 extends AbstractSequence {

  private final A056239 mSeq1 = new A056239();
  private final A061395 mSeq2 = new A061395();

  /** Construct the sequence. */
  public A334201() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
