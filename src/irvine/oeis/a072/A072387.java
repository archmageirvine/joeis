package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000217;

/**
 * A056964.
 * @author Sean A. Irvine
 */
public class A072387 extends FilterSequence {

  /** Construct the sequence. */
  public A072387() {
    super(1, new A000217(), k -> Functions.REVERSE_AND_ADD.z(k).isProbablePrime());
  }
}
