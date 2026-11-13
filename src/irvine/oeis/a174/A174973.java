package irvine.oeis.a174;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A174973 Numbers whose divisors increase by a factor of at most 2.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A174973 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A174973() {
    super(1, n -> {
      final Z[] d = Jaguar.factor(n).divisorsSorted();
      for (int k = 1; k < d.length; ++k) {
        if (d[k].compareTo(d[k - 1].multiply2()) > 0) {
          return false;
        }
      }
      return true;
    });
  }
}
