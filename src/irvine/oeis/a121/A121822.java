package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121822.
 * @author Sean A. Irvine
 */
public class A121822 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121822() {
    super(new long[] {225, -259, 35}, new long[] {1, 5, 65});
  }
}
