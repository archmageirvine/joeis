package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154870 Period 6: repeat <code>[7, 5, 1, -7, -5, -1]</code>.
 * @author Sean A. Irvine
 */
public class A154870 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154870() {
    super(new long[] {-1, 0, 0}, new long[] {7, 5, 1});
  }
}
