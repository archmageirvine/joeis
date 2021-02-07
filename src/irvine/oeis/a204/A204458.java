package irvine.oeis.a204;
// manually

import irvine.oeis.LinearRecurrence;

/**
 * A204458 Odd numbers not divisible by 17.
 * @author Georg Fischer
 */
public class A204458 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204458() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 , 0 , 0, 1}, 
        new long[] {1, 3, 5, 7, 9, 11, 13, 15, 19, 21, 23, 25, 27, 29, 31, 33, 35});
  }
}
