package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081002.
 * @author Sean A. Irvine
 */
public class A081002 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081002() {
    super(new long[] {1, -8, 8}, new long[] {1, 4, 22});
  }
}
