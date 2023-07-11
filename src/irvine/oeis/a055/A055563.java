package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a022.A022424;

/**
 * A055563 a(n) = least number greater than a(n-1) not the sum of an earlier pair of consecutive terms, a(0) = 3.
 * @author Sean A. Irvine
 */
public class A055563 extends ComplementSequence {

  /** Construct the sequence. */
  public A055563() {
    super(0, new A022424(), Z.THREE);
  }
}
