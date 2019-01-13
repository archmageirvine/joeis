package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016257.
 * @author Sean A. Irvine
 */
public class A016257 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016257() {
    super(new long[] {80, -98, 19}, new long[] {1, 19, 263});
  }
}
