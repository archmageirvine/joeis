package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276308.
 * @author Sean A. Irvine
 */
public class A276308 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276308() {
    super(new long[] {1, 0, 0, -35, 0, 0, 35, 0, 0}, new long[] {1, 1, 1, 1, 4, 10, 22, 115, 319});
  }
}
