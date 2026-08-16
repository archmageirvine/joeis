package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A395244 Numbers which are the Collatz iteration encoding of some Collatz trajectory.
 * @author Sean A. Irvine
 */
public class A395244 extends FilterNumberSequence {

  private static Z decode(final Z n) {
    if (n.isZero()) {
      return Z.ONE;
    }
    final Z m = decode(n.divide2());
    if (m == null) {
      return m;
    }
    if (n.isOdd()) {
      return m.multiply2();
    }
    if (m.compareTo(Z.FOUR) > 0 && m.mod(6) == 4) {
      return m.subtract(1).divide(3);
    }
    return null;
  }

  /** Construct the sequence. */
  public A395244() {
    super(1, 0, n -> decode(Z.valueOf(n)) != null);
  }
}
