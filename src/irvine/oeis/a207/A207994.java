package irvine.oeis.a207;

import irvine.oeis.LinearRecurrence;

/**
 * A207994 Number of nX5 0..2 arrays with new values 0..2 introduced in row major order and no element equal to any horizontal or vertical neighbor (colorings ignoring permutations of colors).
 * @author Sean A. Irvine
 */
public class A207994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A207994() {
    super(new long[] {8, -48, 92, -65, 16}, new long[] {8, 81, 853, 9075, 96831});
  }
}
