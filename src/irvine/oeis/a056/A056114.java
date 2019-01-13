package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056114.
 * @author Sean A. Irvine
 */
public class A056114 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056114() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1, 20, 165, 880, 3575, 12012, 35035, 91520, 218790, 486200, 1016158});
  }
}
