package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060131 a(n) = A072411(A275725(n)); order of each permutation listed in tables A060117 and A060118, i.e., the least common multiple of the cycle sizes.
 * @author Sean A. Irvine
 */
public class A060131 extends A060117 {

  private int mN = -1;

  @Override
  public Z next() {
    return permUnrank3R(++mN).order();
  }
}
