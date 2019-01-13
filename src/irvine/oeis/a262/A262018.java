package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262018.
 * @author Sean A. Irvine
 */
public class A262018 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262018() {
    super(new long[] {1, -179, 179}, new long[] {28, 5308, 945148});
  }
}
