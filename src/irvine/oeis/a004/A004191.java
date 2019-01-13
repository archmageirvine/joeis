package irvine.oeis.a004;

import irvine.oeis.LinearRecurrence;

/**
 * A004191.
 * @author Sean A. Irvine
 */
public class A004191 extends LinearRecurrence {

  /** Construct the sequence. */
  public A004191() {
    super(new long[] {-1, 12}, new long[] {1, 12});
  }
}
