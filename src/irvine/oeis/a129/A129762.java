package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129762 Sum of all elements of n X n X n cubic array M[i,j,k] = Fibonacci[i+j+k-2].
 * @author Sean A. Irvine
 */
public class A129762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129762() {
    super(new long[] {1, 1, -14, 6, 24, -26, 9}, new long[] {1, 13, 104, 615, 3149, 14912, 67537});
  }
}
