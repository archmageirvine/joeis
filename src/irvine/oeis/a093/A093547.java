package irvine.oeis.a093;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A093547 Numbers k such that k divides 3^(k^2) - 1.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A093547 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A093547() {
    super(1, 1, k -> Z.THREE.modPow((long) k * k, Z.valueOf(k)).subtract(1).mod(k) == 0);
  }
}
