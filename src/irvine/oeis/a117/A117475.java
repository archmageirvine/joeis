package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117475.
 * @author Sean A. Irvine
 */
public class A117475 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117475() {
    super(new long[] {-1, 0, 6, 0}, new long[] {37, 65, 205, 373});
  }
}
