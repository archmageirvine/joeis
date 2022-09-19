package irvine.oeis.a059;

import irvine.oeis.NoncomputableSequence;

/**
 * A059367 From solution to x = tan x (next term is not an integer).
 * @author Sean A. Irvine
 */
public class A059367 extends NoncomputableSequence {

  // a(6) is not an integer!

  /** Construct the sequence. */
  public A059367() {
    super(1, 2, 13, 146, 2343, 48984);
  }
}
