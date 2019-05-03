package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138382 First differences of <code>A138380</code>. Second differences of <code>A138377</code>.
 * @author Sean A. Irvine
 */
public class A138382 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138382() {
    super(new long[] {-4, 0, 0, 0}, new long[] {1, -3, -1, -2});
  }
}
