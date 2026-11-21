package irvine.oeis.a365;

import irvine.math.z.Z;
import irvine.oeis.a363.A363834;

/**
 * A365590 Number of n X n Boolean relation matrices such that each of the diagonal blocks of its Frobenius normal form is either a 1 block or a 0 block.
 * @author Gregory Morse
 */
public class A365590 extends A363834 {
  @Override
  protected Z choices(final int n) {
    return n == 1 ? Z.TWO : Z.ONE;
  }
}
