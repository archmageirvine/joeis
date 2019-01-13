package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016075.
 * @author Sean A. Irvine
 */
public class A016075 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016075() {
    super(new long[] {-7920, 3382, -539, 38}, new long[] {1, 38, 905, 17290});
  }
}
