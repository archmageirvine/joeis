package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a035.A035536;

/**
 * A046776 Number of partitions of 5n with equal number of parts congruent to each of 0, 1, 2, 3 and 4 (mod 5).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A046776 extends A035536 {

  /** Construct the sequence. */
  public A046776() {
    super(0, 5, 5);
  }

  @Override
  protected Z total(final int[] cn) {
    return cn[0] == cn[1] && cn[1] == cn[2] && cn[2] == cn[3] && cn[3] == cn[4] && cn[0] >= 0 ? Z.ONE : Z.ZERO;
  }
}
