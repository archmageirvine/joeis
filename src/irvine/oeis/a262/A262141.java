package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262141.
 * @author Sean A. Irvine
 */
public class A262141 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262141() {
    super(new long[] {1, -39, 39}, new long[] {181, 7021, 266761});
  }
}
