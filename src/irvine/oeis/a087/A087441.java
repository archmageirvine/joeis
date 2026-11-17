package irvine.oeis.a087;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A087441 Numbers k such that for every prime divisor p of k, p-1 divides k-1.
 * @author Sean A. Irvine
 */
public class A087441 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A087441() {
    super(1, k -> {
      for (final Z p : Jaguar.factor(k).toZArray()) {
        if ((k - 1) % (p.longValueExact() - 1) != 0) {
          return false;
        }
      }
      return true;
    });
  }
}
