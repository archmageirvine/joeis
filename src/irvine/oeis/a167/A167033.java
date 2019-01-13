package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167033.
 * @author Sean A. Irvine
 */
public class A167033 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167033() {
    super(new long[] {64, -84, 21}, new long[] {1, 22, 379});
  }
}
