package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041840 Numerators of continued fraction convergents to <code>sqrt(442)</code>.
 * @author Sean A. Irvine
 */
public class A041840 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041840() {
    super(new long[] {1, 42}, new long[] {21, 883});
  }
}
