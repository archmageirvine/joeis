package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075193.
 * @author Sean A. Irvine
 */
public class A075193 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075193() {
    super(new long[] {1, -1}, new long[] {1, -3});
  }
}
