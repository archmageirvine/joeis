package irvine.oeis.a061;
// manually floor at 2021-08-30 09:14

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A061054 Floor(n+n^(3/4)).
 * @author Georg Fischer
 */

public class A061054 extends FloorSequence {
  /** Construct the sequence. */
  public A061054() {
    super(0);
  }

  protected Z evalCR(final long n) {
    return CR.valueOf(n).pow(3).sqrt().sqrt().add(CR.valueOf(n)).floor(3 * Long.bitCount(n) + 1024);
  }

}
