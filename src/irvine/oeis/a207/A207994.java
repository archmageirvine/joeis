package irvine.oeis.a207;

import irvine.oeis.LinearRecurrence;

/**
 * A207994.
 * @author Sean A. Irvine
 */
public class A207994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A207994() {
    super(new long[] {8, -48, 92, -65, 16}, new long[] {8, 81, 853, 9075, 96831});
  }
}
