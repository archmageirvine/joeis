package irvine.oeis.a391;

import irvine.math.z.Z;

/**
 * A391487 Number of nonequivalent essentially parallel series-parallel networks with longest path of at most n edges and largest cut set of at most n edges.
 * @author Gregory Morse
 */
public class A391487 extends A391485 {
  private int mN = 0;

  @Override
  public Z next() {
    return parallel(++mN, mN);
  }
}
