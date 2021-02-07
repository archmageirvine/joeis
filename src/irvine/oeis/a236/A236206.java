package irvine.oeis.a236;
// manually

import irvine.oeis.HolonomicRecurrence;

/**
 * A236206 Numbers not divisible by 3, 5 or 7.
 * @author Georg Fischer
 */
public class A236206 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A236206() {
    super(1, "[0, 1,-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,-1, 1]",
        "[1, 2, 4, 8, 11, 13, 16, 17, 19, 22, 23, 26, 29, 31, 32, 34, 37, 38, 41, 43, 44, 46, 47, 52, 53, 58, 59, 61, 62, 64, 67, 68, 71, 73, 74, 76, 79, 82, 83, 86, 88, 89, 92, 94, 97, 101, 103, 104, 106]", 0);
  }
}
