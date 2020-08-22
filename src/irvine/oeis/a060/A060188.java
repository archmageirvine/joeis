package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060188 A column and  diagonal of A060187.
 * @author Sean A. Irvine
 */
public class A060188 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060188() {
    super(new long[] {3, -7, 5}, new long[] {1, 6, 23});
  }
}
