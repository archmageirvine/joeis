package irvine.oeis.a377;

/**
 * A377626 Number of words of length n that reduce to the identity when using the presentation S^3, T^2, (ST)^3 of the 12-element group A4.
 * @author Sean A. Irvine
 */
public class A377626 extends A377573 {

  /** Construct the sequence. */
  public A377626() {
    super(new int[][] {
      {2, 7},  // 0
      {0, 3},  // 1
      {1, 9},  // 2
      {1, 5},  // 3
      {3, 6},  // 4
      {4, 10}, // 5
      {4, 8},  // 6
      {0, 6},  // 7
      {7, 11}, // 8
      {2, 11}, // 9
      {5, 9},  // 10
      {8, 10}, // 11
    });
  }
}

