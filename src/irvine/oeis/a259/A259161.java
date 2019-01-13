package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259161.
 * @author Sean A. Irvine
 */
public class A259161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259161() {
    super(new long[] {1, -9603, 9603}, new long[] {5, 48510, 465793515});
  }
}
