package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016273.
 * @author Sean A. Irvine
 */
public class A016273 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016273() {
    super(new long[] {30, -31, 10}, new long[] {1, 10, 69});
  }
}
