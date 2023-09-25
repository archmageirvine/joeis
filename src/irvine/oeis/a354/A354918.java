package irvine.oeis.a354;
// manually charfun at 2023-09-24 22:24

import irvine.oeis.CharacteristicFunction;

/**
 * A354918 a(n) = A344005(n) mod 2, where A344005(n) is the smallest positive m such that n divides the oblong number m*(m+1).
 * @author Georg Fischer
 */
public class A354918 extends CharacteristicFunction {

  /** Construct the sequence. */
  public A354918() {
    super(1, new A354919());
  }
}
