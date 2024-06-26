package irvine.oeis.a094;
// Generated by gen_seq4.pl anopan 1,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a003.A003266;
import irvine.oeis.a062.A062381;

/**
 * A094221 1/detM(n) where M(n) is the n X n matrix m(i,j)=F(i)/F(i+j-1) and F(i)=i-th Fibonacci number.
 * @author Georg Fischer
 */
public class A094221 extends AbstractSequence {

  private final A062381 mSeq1 = new A062381();
  private final A003266 mSeq2 = new A003266();

  /** Construct the sequence. */
  public A094221() {
    super(1);
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().divide(mSeq2.next());
  }
}
