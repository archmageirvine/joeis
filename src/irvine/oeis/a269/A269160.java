package irvine.oeis.a269;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A269160 Formula for Wolfram's Rule 30 cellular automaton: a(n) = n XOR (2n OR 4n).
 * @author Georg Fischer
 */
public class A269160 extends Sequence0 {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).xor(Z.valueOf(2L * mN).or(Z.valueOf(4L * mN)));
  }
}
