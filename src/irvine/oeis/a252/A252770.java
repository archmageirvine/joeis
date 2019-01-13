package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252770.
 * @author Sean A. Irvine
 */
public class A252770 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252770() {
    super(new long[] {1, -63, 63}, new long[] {148, 9155, 567444});
  }
}
