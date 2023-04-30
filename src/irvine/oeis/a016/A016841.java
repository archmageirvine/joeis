package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016841 a(n) = (4n+3)^5.
 * @author Sean A. Irvine
 */
public class A016841 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016841() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {243, 16807, 161051, 759375, 2476099, 6436343});
  }
}
