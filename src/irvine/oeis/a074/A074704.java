package irvine.oeis.a074;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000093;
import irvine.oeis.a000.A000196;

/**
 * A074704 a(n) = floor(n^(3/2)) - n*floor(n^(1/2)).
 * @author Georg Fischer
 */
public class A074704 extends AbstractSequence {

  private A000093 mSeq1 = new A000093();
  private A000196 mSeq2 = new A000196();
  private long mN;

  /** Construct the sequence. */
  public A074704() {
    super(1);
    mN = 0;
    mSeq1.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    // a(n) = A000093(n) - n * A000196(n).
    ++mN;
    return mSeq1.next().subtract(mSeq2.next().multiply(mN));
  }
}
