package irvine.oeis.a001;
// manually 2021-08-07

import irvine.oeis.NoncomputableSequence;

/**
 * A001062 1-, 2-, 3- ... digit numbers in alphabetical order in French (incorrect version, see A187876 for the correct version).
 * (incorrect version, see A187876 for the correct version).
 * @author Georg Fischer
 */
public class A001062 extends NoncomputableSequence {

  /** Construct the sequence. */
  public A001062() {
    super(1, NONCOMPUTABLE, 5, 2, 8, 9, 4, 7, 6, 3, 1, 0, 50, 55, 52, 51, 58, 59, 54, 57,
        56, 53, 10, 18, 19, 17, 12, 11, 40, 45, 42, 41, 48, 49, 44, 47,
        46, 43, 14, 80, 85, 82, 90, 98, 99, 97, 92, 88, 89, 91, 94, 84,
        95, 96, 87, 86, 93, 83, 81, 15, 16, 60, 70, 78, 79, 77, 72, 71,
        74, 75, 76, 73, 13, 30);
  }
}
