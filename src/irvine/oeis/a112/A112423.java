package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112423.
 * @author Sean A. Irvine
 */
public class A112423 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112423() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, -1, 0, 1, 0, 0, 0, 0, 0, 1}, new long[] {6, 24, 42, 60, 78, 96, 114, 138, 162, 198, 234, 270, 306, 342, 384, 426});
  }
}
