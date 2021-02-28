package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a035.A035536;

/**
 * A039905 Number of partitions with at most one part divisible by 5.
 * @author Sean A. Irvine
 */
public class A039905 extends A035536 {

  /** Construct the sequence. */
  public A039905() {
    super(1, 5, 1, new int[0]);
  }

  @Override
  protected Z total(final int[] cn) {
    return cn[0] <= 1 ? Z.ONE : Z.ZERO;
  }
}
