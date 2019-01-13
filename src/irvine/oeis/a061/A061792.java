package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061792.
 * @author Sean A. Irvine
 */
public class A061792 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061792() {
    super(new long[] {1, -3, 3}, new long[] {6, 55, 153});
  }
}
