package irvine.oeis.a347;
// manually 2023-07-10

import irvine.math.z.Z;

/**
 * A347087 Sum of n and the Dirichlet inverse of n - A003415(n).
 * @author Georg Fischer
 */
public class A347087 extends A347082 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return super.next().add(mN);
  }
}
