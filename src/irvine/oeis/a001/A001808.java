package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001808 Expansion of 1/((1+x)*(1-x)^12).
 * @author Sean A. Irvine
 */
public class A001808 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001808() {
    super(new long[] {-1, 11, -54, 154, -275, 297, -132, -132, 297, -275, 154, -54, 11}, new long[] {1, 11, 67, 297, 1068, 3300, 9076, 22748, 52834, 115126, 237590, 467842, 884236});
  }
}
