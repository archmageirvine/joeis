package irvine.oeis.a126;
// Generated by gen_seq4.pl anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a020.A020639;
import irvine.oeis.a032.A032742;

/**
 * A126286 a(1) = 2, a(n) = n * LeastPrimeFactor(n+1) / LeastPrimeFactor(n).
 * @author Georg Fischer
 */
public class A126286 extends AbstractSequence {

  private final A032742 mSeq1 = new A032742();
  private final A020639 mSeq2 = new A020639();

  /** Construct the sequence. */
  public A126286() {
    super(1);
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mSeq2.next());
  }
}
