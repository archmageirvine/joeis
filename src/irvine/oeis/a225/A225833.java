package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225833.
 * @author Sean A. Irvine
 */
public class A225833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225833() {
    super(new long[] {8388608, -278528, -15872, 544}, new long[] {1, 272, 66048, 33632256});
  }
}
