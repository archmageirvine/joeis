package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085787 Generalized heptagonal numbers: m*(5*m <code>- 3)/2</code>, m <code>= 0, +-1, +-2 +-3, </code>...
 * @author Sean A. Irvine
 */
public class A085787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085787() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 4, 7, 13});
  }
}
