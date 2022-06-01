package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291731 a(n) = (1/2)*A291730(n)..
 * @author Sean A. Irvine
 */
public class A291731 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291731() {
    super(new long[] {2, 0, 4, 2, 2, 2}, new long[] {1, 3, 9, 28, 84, 255});
  }
}
