package irvine.oeis.a138;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A138382 First differences of A138380. Second differences of A138377.
 * @author Sean A. Irvine
 */
public class A138382 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138382() {
    super(new long[] {-4, 0, 0, 0}, new long[] {1, -3, -1, -2});
  }
}
