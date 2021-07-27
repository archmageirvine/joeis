package irvine.oeis.a271;
// manually 2021-07-21

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A271936 Commutative powers: numbers of the form a^b = b^a.
 * Like A000312, but starting with 1, 4, 16, 27 ...
 * @author Georg Fischer
 */
public class A271936 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    switch (++mN) {
      case 0: 
        return Z.ONE;
      case 1: 
        return Z.FOUR;
      case 2: 
        return Z.valueOf(16);
      default:
        return Z.valueOf(mN).pow(mN);
    }
  }
}
