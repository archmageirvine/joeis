package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275903.
 * @author Sean A. Irvine
 */
public class A275903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275903() {
    super(new long[] {4, -4, 5}, new long[] {1, 5, 25});
  }
}
