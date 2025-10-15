package irvine.oeis.a051;

import irvine.oeis.InverseSequence;

/**
 * A051522 Least positive integer with exactly n representations as k/d(k), where d(k) = number of divisors of k.
 * @author Sean A. Irvine
 */
public class A051522 extends InverseSequence {

  /** Construct the sequence. */
  public A051522() {
    super(0, 0, new A051521());
  }
}
