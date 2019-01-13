package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167704.
 * @author Sean A. Irvine
 */
public class A167704 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167704() {
    super(new long[] {1, 1, 1, 0}, new long[] {1, 0, 2, 1});
  }
}
