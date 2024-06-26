package irvine.oeis.a222;
// Generated by gen_seq4.pl anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a005.A005408;
import irvine.oeis.a005.A005843;

/**
 * A222621 a(n) = (2n-1)^(2n).
 * @author Georg Fischer
 */
public class A222621 extends AbstractSequence {

  private final A005408 mSeq1 = new A005408();
  private final A005843 mSeq2 = new A005843();

  /** Construct the sequence. */
  public A222621() {
    super(1);
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().pow(mSeq2.next());
  }
}
