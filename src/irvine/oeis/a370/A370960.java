package irvine.oeis.a370;

import irvine.math.z.Z;
import irvine.oeis.a372.A372254;

/**
 * A370960 a(n) = number of acyclic orientations of the complete tripartite graph K_{2,2,n}.
 * @author Gregory Morse
 */
public class A370960 extends A372254 {
  private int mN = -1;

  @Override
  public Z next() {
    return t(2, ++mN);
  }
}
