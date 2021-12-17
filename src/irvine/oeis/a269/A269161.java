package irvine.oeis.a269;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A269161 Formula for Wolfram's Rule 86 cellular automaton: a(n) = 4n XOR (2n OR n).
 * @author Georg Fischer
 */
public class A269161 implements Sequence {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(4 * mN).xor(Z.valueOf(2 * mN).or(Z.valueOf(mN)));
  }
}
