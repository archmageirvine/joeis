package irvine.oeis.a326;
// manually nopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a030.A030101;

/**
 * A326302 a(n) = lcm(n, r(n)) where r(n) = A030101(n) corresponds to the binary reversal of n.
 * @author Georg Fischer
 */
public class A326302 extends AbstractSequence {

  private int mN;
  private A030101 mSeq1 = new A030101();

  /** Construct the sequence. */
  public A326302() {
    super(0);
    mN = -1;
    mSeq1.next();
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ZERO : Z.valueOf(mN).lcm(mSeq1.next());
  }
}
