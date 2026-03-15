package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A393747.
 * @author Sean A. Irvine
 */
public class A084201 extends FilterSequence {

  /** Construct the sequence. */
  public A084201() {
    super(1, new A000040(), p -> Functions.DIGIT_SUM.z(p).isProbablePrime() && Functions.DIGIT_SUM.z(p.multiply2()).isProbablePrime());
  }
}

