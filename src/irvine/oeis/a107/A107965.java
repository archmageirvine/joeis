package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107965.
 * @author Sean A. Irvine
 */
public class A107965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107965() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1, 33, 421, 3171, 16954, 71148, 249228, 758934, 2066559, 5135845, 11828817});
  }
}
