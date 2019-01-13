package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290920.
 * @author Sean A. Irvine
 */
public class A290920 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290920() {
    super(new long[] {-1, 15, -95, 330, -685, 873, -685, 330, -95, 15}, new long[] {5, 25, 110, 450, 1746, 6505, 23465, 82435, 283270, 955258});
  }
}
