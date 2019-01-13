package irvine.oeis.a146;

import irvine.oeis.LinearRecurrence;

/**
 * A146086.
 * @author Sean A. Irvine
 */
public class A146086 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146086() {
    super(new long[] {15, -23, 9}, new long[] {3, 11, 45});
  }
}
