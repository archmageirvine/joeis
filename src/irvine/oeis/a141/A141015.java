package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141015.
 * @author Sean A. Irvine
 */
public class A141015 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141015() {
    super(new long[] {1, 2, 1}, new long[] {0, 1, 2});
  }
}
