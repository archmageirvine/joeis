package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A086402 Nontrivial numbers which are prime and yield another prime when their digits are sorted in descending order.
 * @author Sean A. Irvine
 */
public class A086402 extends FilterSequence {

  /** Construct the sequence. */
  public A086402() {
    super(1, new A000040(), p -> {
      final Z dec = Functions.DIGIT_SORT_DESCENDING.z(p);
      return !dec.equals(p) && dec.isProbablePrime();
    });
  }
}

