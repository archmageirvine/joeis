package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134029 Period <code>9</code>: repeat <code>3, 2, 4, 1, 5, 1, 4, 2, 3</code>.
 * @author Sean A. Irvine
 */
public class A134029 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134029() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {3, 2, 4, 1, 5, 1, 4, 2, 3});
  }
}
