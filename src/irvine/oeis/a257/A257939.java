package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257939.
 * @author Sean A. Irvine
 */
public class A257939 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257939() {
    super(new long[] {1, -1, -322, 322, 1}, new long[] {0, 2, 116, 798, 37512});
  }
}
