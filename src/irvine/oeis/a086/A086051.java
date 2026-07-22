package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A086051 Nontrivial numbers which are prime, contain no zero digits and yield another prime when their digits are sorted in ascending order.
 * @author Sean A. Irvine
 */
public class A086051 extends FilterSequence {

  /** Construct the sequence. */
  public A086051() {
    super(1, new A000040(), p -> {
      if ((Functions.SYNDROME.i(p) & 1) == 1) {
        return false;
      }
      final Z asc = Functions.DIGIT_SORT_ASCENDING.z(p);
      return !asc.equals(p) && asc.isProbablePrime();
    });
  }
}
