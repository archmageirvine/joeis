package irvine.oeis.a125;

import irvine.oeis.triangle.DirectArray;

/**
 * A125800 Rectangular table where column k equals row sums of matrix power A078122^k, read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A125800 extends A125790 implements DirectArray {

  /** Construct the sequence. */
  public A125800() {
    super(0, 3);
  }

}

