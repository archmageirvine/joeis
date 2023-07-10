package irvine.oeis.a358;
// manually 2023-07-10

import irvine.math.z.Z;

/**
 * A358778 Positions of positive terms in A358777, which is the Dirichlet inverse of A353557.
 * @author Georg Fischer
 */
public class A358778 extends A358777 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().compareTo(Z.ZERO) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
