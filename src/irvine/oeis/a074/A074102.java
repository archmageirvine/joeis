package irvine.oeis.a074;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000578;

/**
 * A074102 Cubes from which deleting a suitable digit leaves a square.
 * @author Sean A. Irvine
 */
public class A074102 extends FilterSequence {

  /** Construct the sequence. */
  public A074102() {
    super(1, new A000578().skip(), k -> {
      final String s = k.toString();
      if (s.length() == 1) {
        return true; // Deleting a digit leaves "" (or 0)
      }
      for (int j = 0; j < s.length(); ++j) {
        if (Predicates.SQUARE.is(new Z(s.substring(0, j) + s.substring(j + 1)))) {
          return true;
        }
      }
      return false;
    });
  }
}
