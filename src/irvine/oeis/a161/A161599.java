package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161599.
 * @author Sean A. Irvine
 */
public class A161599 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161599() {
    super(new long[] {-1, 17}, new long[] {1, 18});
  }
}
