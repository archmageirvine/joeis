package irvine.oeis.a178;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a005.A005408;
import irvine.oeis.a081.A081294;

/**
 * A178970 a(n) = 2^(2n-1) mod (2n+1).
 * @author Georg Fischer
 */
public class A178970 extends AbstractSequence {

  private final A081294 mSeq1 = new A081294();
  private final A005408 mSeq2 = new A005408();

  /** Construct the sequence. */
  public A178970() {
    super(1);
    mSeq1.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().mod(mSeq2.next());
  }
}
