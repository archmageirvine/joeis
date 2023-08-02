package irvine.oeis.a269;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A269161 Formula for Wolfram's Rule 86 cellular automaton: a(n) = 4n XOR (2n OR n).
 * @author Georg Fischer
 */
public class A269161 extends Sequence0 {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(4L * mN).xor(Z.valueOf(2L * mN).or(Z.valueOf(mN)));
  }
}
