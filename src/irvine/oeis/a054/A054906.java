package irvine.oeis.a054;
// manually 2023-06-18

import irvine.oeis.a020.A020483;

/**
 * A054906 Smallest number x such that sigma(x+2n) = sigma(x)+2n (first definition).
 * @author Georg Fischer
 */
public class A054906 extends A020483 {

  {
    setOffset(1);
  }

  /** Construct the sequence. */
  public A054906() {
    next();
  }
}
