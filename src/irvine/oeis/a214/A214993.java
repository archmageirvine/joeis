package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214993 Power floor sequence of <code>(golden ratio)^5</code>.
 * @author Sean A. Irvine
 */
public class A214993 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214993() {
    super(new long[] {-1, -10, 12}, new long[] {11, 121, 1341});
  }
}
