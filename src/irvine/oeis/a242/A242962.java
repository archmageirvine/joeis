package irvine.oeis.a242;
// manually anopan 0,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000217;
import irvine.oeis.a024.A024816;

/**
 * A242962 a(1) = a(2) = 0; for n &gt;= 3: a(n) = (n*(n+1)/2) mod antisigma(n) = A000217(n) mod A024816(n).
 * @author Georg Fischer
 */
public class A242962 extends AbstractSequence {

  private int mN = 0;
  private A000217 mSeq1 = new A000217();
  private A024816 mSeq2 = new A024816();

  /** Construct the sequence. */
  public A242962() {
    super(1);
    mSeq1.next();
    mSeq1.next();
    mSeq2.next();
    mSeq1.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return (++mN <= 2) ? Z.ZERO : mSeq1.next().mod(mSeq2.next());
  }
}
