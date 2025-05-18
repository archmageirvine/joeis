package irvine.oeis.a269;
// manually 2025-04-01 direct

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A269174 Formula for Wolfram's Rule 124 cellular automaton: a(n) = (n OR 2n) AND ((n XOR 2n) OR (n XOR 4n)).
 * @author Georg Fischer
 */
public class A269174 extends Sequence0 implements DirectSequence {

  protected int mN = -1;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return n.or(n.multiply2()).and((n.xor(n.multiply2())).or(n.xor(n.multiply(4))));
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(n).or(Z.valueOf(2L * n)).and((Z.valueOf(n).xor(Z.valueOf(2L * n))).or(Z.valueOf(n).xor(Z.valueOf(4L * n))));
  }

}
