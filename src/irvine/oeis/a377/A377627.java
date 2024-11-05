package irvine.oeis.a377;

/**
 * A377627 Cogrowth sequence of the 12-element group C6 x C2 = &lt;S,T | S^6, T^2, [S,T]&gt;.
 * @author Sean A. Irvine
 */
public class A377627 extends A377573 {

  /** Construct the sequence. */
  public A377627() {
    super(new int[][] {
      {5, 6},  // 0
      {0, 7},  // 1
      {1, 8},  // 2
      {2, 9},  // 3
      {3, 10}, // 4
      {4, 11}, // 5
      {0, 11}, // 6
      {1, 6},  // 7
      {2, 7},  // 8
      {3, 8},  // 9
      {4, 9},  // 10
      {5, 10}, // 11
    }, 2, 0);
  }
}

