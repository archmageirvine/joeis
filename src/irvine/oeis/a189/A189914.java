package irvine.oeis.a189;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a048.A048671;
import irvine.oeis.a066.A066781;

/**
 * A189914 a(n) is 2^phi(n) times the least common multiple of the proper divisors of n.
 * @author Georg Fischer
 */
public class A189914 extends AbstractSequence {

  private int mN = -1;
  private final A066781 mSeq1 = new A066781();
  private final A048671 mSeq2 = new A048671();

  /** Construct the sequence. */
  public A189914() {
    super(0);
    mSeq2.next();
    mSeq1.next();
  }

  @Override
  public Z next() {
    return (++mN <= 1) ? Z.valueOf(mN + 1) : mSeq1.next().multiply(mSeq2.next());
  }
}
