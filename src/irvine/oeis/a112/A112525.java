package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112525.
 * @author Sean A. Irvine
 */
public class A112525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112525() {
    super(new long[] {100, 100, 0}, new long[] {1, 0, 100});
  }
}
