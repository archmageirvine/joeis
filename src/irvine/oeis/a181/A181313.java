package irvine.oeis.a181;
// manually deris/essent at 2022-10-26 11:22

import irvine.oeis.PrependSequence;
import irvine.oeis.a125.A125600;

/**
 * A181313 Continued fraction expansion of the Fibonacci binary number.
 * @author Georg Fischer
 */
public class A181313 extends PrependSequence {

  /** Construct the sequence. */
  public A181313() {
    super(0, new A125600().skip(1), 1);
  }
}
