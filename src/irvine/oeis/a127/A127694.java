package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127694 Absolute value of coefficient of <code>x^3</code> in polynomial whose zeros are 5 consecutive integers starting with the n-th integer.
 * @author Sean A. Irvine
 */
public class A127694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127694() {
    super(new long[] {-1, 4, -6, 4}, new long[] {580, 1175, 2070, 3325});
  }
}
