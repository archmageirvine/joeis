package irvine.oeis.a282;
// Generated by gen_seq4.pl simple3 at 2023-03-24 09:26

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a013.A013963;

/**
 * A282777 Expansion of phi_{16, 1}(x) where phi_{r, s}(x) = Sum_{n, m&gt;0} m^r * n^s * x^{m*n}.
 * @author Georg Fischer
 */
public class A282777 extends AbstractSequence {

  private int mN = -1;
  private final A013963 mSeq = new A013963();

  /** Construct the sequence. */
  public A282777() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ZERO : Z.valueOf(mN).multiply(mSeq.next());
  }
}
