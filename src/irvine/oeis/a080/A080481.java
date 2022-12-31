package irvine.oeis.a080;
// manually concatn at 2022-12-30 21:09

import irvine.oeis.a001.A001477;
import irvine.oeis.a133.A133013;

/**
 * A080481 Concatenation of next n numbers (a(1) = 0).
 * @author Georg Fischer
 */
public class A080481 extends A133013 {

  /** Construct the sequence. */
  public A080481() {
    super(1, new A001477(), 10);
  }
}
