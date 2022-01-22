package irvine.oeis.a054;
// manually 2021-08-08

import irvine.oeis.NoncomputableSequence;

/**
 * A054245 Beethoven's Fifth Symphony; 1 stands for the first note in the minor scale, etc.
 * @author Georg Fischer
 */
public class A054245 extends NoncomputableSequence {

  /** Construct the sequence. */
  public A054245() {
    super(5, 5, 5, 3, 4, 4, 4, 2, 5, 5, 5, 3, 6, 6, 6, 5, 10, 10,
      10, 8, 5, 5, 5, 2, 6, 6, 6, 5, 11, 11, 11, 9, 12, 12, 11,
      10, 9, 12, 12, 11, 10, 9, 12, 12, 11, 10, 8, 12, 13, 13, 13, 11);
  }
}
