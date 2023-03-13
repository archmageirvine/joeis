package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a014.A014486;

/**
 * A061855 Symmetric totally balanced binary sequences: those terms of A014486 which are equal to their reversed complement.
 * @author Sean A. Irvine
 */
public class A061855 extends FilterSequence {

  static boolean is(final Z n) {
    for (int k = 0, j = n.bitLength() - 1; k < j; ++k, --j) {
      if (n.testBit(k) == n.testBit(j)) {
        return false;
      }
    }
    return true;
  }

  /** Construct the sequence. */
  public A061855() {
    super(0, new A014486(), A061855::is);
  }
}
