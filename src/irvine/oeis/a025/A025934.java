package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025934.
 * @author Sean A. Irvine
 */
public class A025934 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025934() {
    super(new long[] {-300, 340, -131, 20}, new long[] {1, 20, 269, 3100});
  }
}
