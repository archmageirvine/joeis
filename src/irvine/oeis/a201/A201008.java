package irvine.oeis.a201;

import irvine.oeis.LinearRecurrence;

/**
 * A201008.
 * @author Sean A. Irvine
 */
public class A201008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A201008() {
    super(new long[] {1, -483, 483}, new long[] {0, 55, 26565});
  }
}
