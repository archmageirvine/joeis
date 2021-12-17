package irvine.oeis.a269;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A269160 Formula for Wolfram's Rule 30 cellular automaton: a(n) = n XOR (2n OR 4n).
 * @author Georg Fischer
 */
public class A269160 implements Sequence {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).xor(Z.valueOf(2 * mN).or(Z.valueOf(4 * mN)));
  }
}
