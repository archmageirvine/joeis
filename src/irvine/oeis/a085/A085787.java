package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085787 Generalized heptagonal numbers: <code>m*(5*m - 3)/2, m = 0, +-1, +-2 +-3, ..</code>.
 * @author Sean A. Irvine
 */
public class A085787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085787() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 4, 7, 13});
  }
}
