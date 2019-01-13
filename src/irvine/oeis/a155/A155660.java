package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155660.
 * @author Sean A. Irvine
 */
public class A155660 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155660() {
    super(new long[] {63, -79, 17}, new long[] {1, 3, 33});
  }
}
