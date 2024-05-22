package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002808;

/**
 * A066073 Composite numbers n such that sigma(n) - 1 is prime.
 * @author Sean A. Irvine
 */
public class A066073 extends FilterSequence {

  /** Construct the sequence. */
  public A066073() {
    super(1, new A002808(), k -> Functions.SIGMA1.z(k).subtract(1).isProbablePrime());
  }
}
