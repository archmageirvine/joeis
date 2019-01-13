package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051879.
 * @author Sean A. Irvine
 */
public class A051879 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051879() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 14, 69, 224, 574, 1260});
  }
}
