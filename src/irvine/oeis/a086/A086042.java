package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A086042 Nontrivial numbers which are prime and yield another prime when their digits are sorted in ascending order.
 * @author Sean A. Irvine
 */
public class A086042 extends FilterSequence {

  /** Construct the sequence. */
  public A086042() {
    super(1, new A000040(), p -> {
      final Z s = Functions.DIGIT_SORT_ASCENDING.z(p);
      return !s.equals(p) && s.isProbablePrime();
    });
  }
}
