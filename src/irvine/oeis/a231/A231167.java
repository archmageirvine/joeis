package irvine.oeis.a231;
// manually anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a024.A024816;
import irvine.oeis.a049.A049820;

/**
 * A231167 a(1) = a(2) = 0, for n&gt;=3: (sum of non-divisors of n) modulo (number of non-divisors of n).
 * @author Georg Fischer
 */
public class A231167 extends AbstractSequence {

  private int mN = 0;
  private A024816 mSeq1 = new A024816();
  private A049820 mSeq2 = new A049820();

  /** Construct the sequence. */
  public A231167() {
    super(1);
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
