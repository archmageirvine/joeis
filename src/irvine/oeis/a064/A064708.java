package irvine.oeis.a064;

import irvine.oeis.NoncomputableSequence;

/**
 * A064708 Initial term of run of (at least) n consecutive numbers with just 2 distinct prime factors.
 * @author Sean A. Irvine
 */
public class A064708 extends NoncomputableSequence {

  /** Construct the sequence. */
  public A064708() {
    super(1, NONCOMPUTABLE, 6, 14, 20, 33, 54, 91, 141, 141);
  }
}
