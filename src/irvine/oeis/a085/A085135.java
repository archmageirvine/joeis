package irvine.oeis.a085;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002473;

/**
 * A085135 Numbers whose cyclic permutations are all 7-smooth (A002473).
 * @author Sean A. Irvine
 */
public class A085135 extends FilterSequence {

  /** Construct the sequence. */
  public A085135() {
    super(1, new A002473(), k -> {
      final String s = k.toString();
      for (int j = 1; j < s.length(); ++j) {
        if (!Predicates.SMOOTH.is(7, new Z(s.substring(j) + s.substring(0, j)))) {
          return false;
        }
      }
      return true;
    });
  }
}
