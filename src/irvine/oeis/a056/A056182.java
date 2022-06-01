package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056182 First differences of A003063.
 * @author Sean A. Irvine
 */
public class A056182 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056182() {
    super(new long[] {-6, 5}, new long[] {0, 2});
  }
}
