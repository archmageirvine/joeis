package irvine.oeis.a377;

/**
 * A377714 Cogrowth sequence for the 8-element group C4 x C2 = &lt;S,T | S^4, T^2, [S,T]&gt;.
 * @author Sean A. Irvine
 */
public class A377714 extends A377573 {

  /** Construct the sequence. */
  public A377714() {
    super(new int[][] {
      {3, 4},  // 0
      {0, 5},  // 1
      {1, 6},  // 2
      {2, 7},  // 3
      {0, 7},  // 4
      {1, 4},  // 5
      {2, 5},  // 6
      {3, 6},  // 7
    }, 2, 0);
  }
}

