package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155646.
 * @author Sean A. Irvine
 */
public class A155646 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155646() {
    super(new long[] {48, -62, 15}, new long[] {1, 13, 99});
  }
}
