package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155621.
 * @author Sean A. Irvine
 */
public class A155621 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155621() {
    super(new long[] {40, -54, 15}, new long[] {1, 13, 115});
  }
}
