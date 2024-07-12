package irvine.oeis.a071;

import irvine.oeis.Combiner;

/**
 * A071310 a(n) = (1/4) * (number of n X n 0..11 matrices with MM' mod 12 = I).
 * @author Sean A. Irvine
 */
public class A071310 extends Combiner {

  /** Construct the sequence. */
  public A071310() {
    super(1, new A071302(), new A071303(), MULTIPLY);
  }
}
