package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056182 First differences of <code>A003063</code>.
 * @author Sean A. Irvine
 */
public class A056182 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056182() {
    super(new long[] {-6, 5}, new long[] {0, 2});
  }
}
