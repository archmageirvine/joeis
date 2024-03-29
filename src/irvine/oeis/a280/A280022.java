package irvine.oeis.a280;
// Generated by gen_seq4.pl simple3 at 2023-03-24 09:26

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000203;

/**
 * A280022 Expansion of phi_{5, 4}(x) where phi_{r, s}(x) = Sum_{n, m&gt;0} m^r * n^s * x^{m*n}.
 * @author Georg Fischer
 */
public class A280022 extends AbstractSequence {

  private int mN = -1;
  private final A000203 mSeq = new A000203();

  /** Construct the sequence. */
  public A280022() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ZERO : Z.valueOf(mN).pow(4).multiply(mSeq.next());
  }
}
