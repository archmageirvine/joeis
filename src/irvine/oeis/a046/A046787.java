package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a035.A035536;

/**
 * A046787 Number of partitions of 5n with equal nonzero number of parts congruent to each of 1, 2, 3 and 4 modulo 5.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A046787 extends A035536 {

  /** Construct the sequence. */
  public A046787() {
    super(0, 5, 5);
  }

  @Override
  protected Z total(final int[] cn) {
    return cn[1] == cn[2] && cn[2] == cn[3] && cn[3] == cn[4] && cn[1] >= 1 ? Z.ONE : Z.ZERO;
  }
}
