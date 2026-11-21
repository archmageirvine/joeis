package irvine.oeis.a210;

import irvine.math.z.Z;

/**
 * A210655 Number of irreducible coverings by edges of the complete bipartite graph K_{n,n}; main diagonal of A210654.
 * @author Gregory Morse
 */
public class A210655 extends A210654 {
  private int mN = -1;

  @Override
  public Z next() {
    return compute(++mN, mN);
  }
}
