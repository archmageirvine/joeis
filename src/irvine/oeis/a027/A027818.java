package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027818.
 * @author Sean A. Irvine
 */
public class A027818 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027818() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 14, 84, 336, 1050, 2772, 6468, 13728});
  }
}
