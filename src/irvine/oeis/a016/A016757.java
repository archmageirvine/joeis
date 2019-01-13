package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016757.
 * @author Sean A. Irvine
 */
public class A016757 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016757() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 243, 3125, 16807, 59049, 161051});
  }
}
