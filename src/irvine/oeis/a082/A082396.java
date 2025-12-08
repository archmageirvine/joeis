package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A082396 Numbers k such that k/(2*k-A082851(k)) is an integer.
 * @author Sean A. Irvine
 */
public class A082396 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A082396() {
    super(1, 1, new A082851(), (n, k) -> Z.valueOf(n).mod(Z.valueOf(2L * n).subtract(k)).isZero());
  }
}
