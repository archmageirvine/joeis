package irvine.oeis.a069;
// manually deris/essent at 2022-10-26 11:22

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002780;

/**
 * A069748 Numbers k such that k and k^3 are both palindromes.
 * @author Georg Fischer
 */
public class A069748 extends A002780 {

  @Override
  public Z next() {
    while (true) {
      final Z result = super.next();
      if (Functions.REVERSE.z(result).equals(result)) {
        return result;
      }
    }
  }
}
