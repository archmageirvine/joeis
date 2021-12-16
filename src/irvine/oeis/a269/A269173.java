package irvine.oeis.a269;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A269173 Formula for Wolfram&apos;s Rule 126 cellular automaton: a(n) = (n XOR 2n) OR (n XOR 4n).
 * @author Georg Fischer
 */
public class A269173 implements Sequence {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).xor(Z.valueOf(2 * mN)).or(Z.valueOf(mN).xor(Z.valueOf(4 * mN)));
  }
}
