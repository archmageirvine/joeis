package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001358;

/**
 * A086697 Left-truncatable semiprimes, i.e., semiprimes in which repeatedly deleting the leftmost digit gives a semiprime at every step until a single-digit semiprime remains.
 * @author Sean A. Irvine
 */
public class A086697 extends FilterSequence {

  /** Construct the sequence. */
  public A086697() {
    super(1, new A001358(), k -> {
      if ((Functions.SYNDROME.i(k) & 1) == 1) {
        // Contains a 0
        return false;
      }
      Z mod = Z.TEN;
      while (mod.compareTo(k) < 0) {
        if (!Predicates.SEMIPRIME.is(k.mod(mod))) {
          return false;
        }
        mod = mod.multiply(10);
      }
      return true;
    });
  }
}
