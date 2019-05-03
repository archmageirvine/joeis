package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A007400 Continued fraction for <code>Sum_{n&gt;=0} 1/2^(2^n) = 0.8164215090218931..</code>.
 * @author Sean A. Irvine
 */
public class A007400 extends MemorySequence {

  // After Robert Israel

  @Override
  protected Z computeNext() {
    final int n = size();
    switch (n) {
      case 0:
        return Z.ZERO;
      case 1:
        return Z.ONE;
      case 2:
        return Z.FOUR;
      default:
        switch (n & 7) {
          case 0:
          case 3:
            return Z.TWO;
          case 4:
          case 7:
            return Z.FOUR;
          case 1:
            return get((n + 1) / 2);
          case 2:
            return get((n + 2) / 2);
          default:
            final int n16 = n & 15;
            if (n16 == 5 || n16 == 14) {
              return Z.FOUR;
            } else {
              return Z.SIX;
            }
        }
    }
  }
}
