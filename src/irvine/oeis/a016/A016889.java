package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016889.
 * @author Sean A. Irvine
 */
public class A016889 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016889() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {243, 32768, 371293, 1889568, 6436343, 17210368});
  }
}
