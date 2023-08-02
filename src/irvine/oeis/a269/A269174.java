package irvine.oeis.a269;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A269174 Formula for Wolfram's Rule 124 cellular automaton: a(n) = (n OR 2n) AND ((n XOR 2n) OR (n XOR 4n)).
 * @author Georg Fischer
 */
public class A269174 extends Sequence0 {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).or(Z.valueOf(2L * mN)).and((Z.valueOf(mN).xor(Z.valueOf(2L * mN))).or(Z.valueOf(mN).xor(Z.valueOf(4L * mN))));
  }
}
