package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105940.
 * @author Sean A. Irvine
 */
public class A105940 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105940() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {56, 756, 5292, 25872, 99792, 324324, 924924, 2378376, 5621616, 12388376, 25729704});
  }
}
