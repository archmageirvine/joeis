package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064226.
 * @author Sean A. Irvine
 */
public class A064226 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064226() {
    super(new long[] {1, -3, 3}, new long[] {3, 14, 34});
  }
}
