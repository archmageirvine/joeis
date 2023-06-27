package irvine.oeis.a138;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A138803 Imaginary parts of terms (1,1), (2,2) of matrix [1,(1+I); 1,1]^n.
 * @author Sean A. Irvine
 */
public class A138803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138803() {
    super(1, new long[] {-1, 0, -4, 4}, new long[] {0, 1, 3, 8});
  }
}
