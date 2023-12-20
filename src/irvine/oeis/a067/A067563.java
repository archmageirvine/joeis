package irvine.oeis.a067;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002808;

/**
 * A067563 Product of n-th prime number and n-th composite number.
 * @author Sean A. Irvine
 */
public class A067563 extends Combiner {

  /** Construct the sequence. */
  public A067563() {
    super(1, new A000040(), new A002808(), MULTIPLY);
  }
}
