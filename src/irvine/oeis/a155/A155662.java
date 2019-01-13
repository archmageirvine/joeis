package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155662.
 * @author Sean A. Irvine
 */
public class A155662 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155662() {
    super(new long[] {77, -95, 19}, new long[] {1, 5, 73});
  }
}
