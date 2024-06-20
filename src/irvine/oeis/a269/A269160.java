package irvine.oeis.a269;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A269160 Formula for Wolfram's Rule 30 cellular automaton: a(n) = n XOR (2n OR 4n).
 * @author Georg Fischer
 */
public class A269160 extends Sequence0 implements DirectSequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).xor(Z.valueOf(2L * mN).or(Z.valueOf(4L * mN)));
  }

  @Override
  public Z a(final Z n) {
    return n.xor(n.multiply2().or(n.shiftLeft(2)));
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(n).xor(Z.valueOf(2L * n).or(Z.valueOf(4L * n)));
  }

}
