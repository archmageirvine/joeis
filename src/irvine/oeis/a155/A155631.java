package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155631.
 * @author Sean A. Irvine
 */
public class A155631 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155631() {
    super(new long[] {40, -54, 15}, new long[] {1, 7, 85});
  }
}
