package irvine.oeis.a205;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A205088 a(n)=n 8's sandwiched between two 1's.
 * @author Sean A. Irvine
 */
public class A205088 extends LinearRecurrence {

  /** Construct the sequence. */
  public A205088() {
    super(new long[] {-10, 11}, new long[] {11, 181});
  }
}
