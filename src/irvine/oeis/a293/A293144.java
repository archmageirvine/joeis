package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293144.
 * @author Sean A. Irvine
 */
public class A293144 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293144() {
    super(new long[] {-480, 724, -275, 32}, new long[] {8, 64, 896, 15616});
  }
}
