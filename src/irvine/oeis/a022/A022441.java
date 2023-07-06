package irvine.oeis.a022;

import irvine.oeis.PrependSequence;

/**
 * A022441 a(n) = c(n) + c(n-1) where c (A055562) is the sequence of numbers not in a.
 * @author Sean A. Irvine
 */
public class A022441 extends PrependSequence {

  /** Construct the sequence. */
  public A022441() {
    super(new A022424(1, 5).skip(3), 1, 5);
  }
}
