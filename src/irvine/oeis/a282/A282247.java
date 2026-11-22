package irvine.oeis.a282;

import irvine.math.z.Z;
import irvine.oeis.a212.A212221;

/**
 * A282247 a(n) = 1/(2*n) times the number of n-colorings of the complete tripartite graph K_(k,k,k).
 * @author Gregory Morse
 */
public class A282247 extends A212221 {
  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, mN);
  }
}
