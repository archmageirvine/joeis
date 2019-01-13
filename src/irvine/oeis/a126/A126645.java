package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126645.
 * @author Sean A. Irvine
 */
public class A126645 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126645() {
    super(new long[] {6, -11, 6}, new long[] {5, 21, 77});
  }
}
