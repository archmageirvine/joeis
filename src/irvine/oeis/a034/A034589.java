package irvine.oeis.a034;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a000.A000959;

/**
 * A034589 Lucky numbers N (A000959) such that Fibonacci iterations starting with (1, N) lead to a "nine digits anagram".
 * @author Sean A. Irvine
 */
public class A034589 extends IntersectionSequence {

  /** Construct the sequence. */
  public A034589() {
    super(new A034587(), new A000959());
  }
}
