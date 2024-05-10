package irvine.oeis.a068;

import irvine.oeis.a000.A000217;

/**
 * A068149 Triangular numbers in which neighboring digits differ at most by 1. Allowed neighbors of 9 are 0, 8 and 9.
 * @author Sean A. Irvine
 */
public class A068149 extends A068148 {

  /** Construct the sequence. */
  public A068149() {
    super(new A000217());
    setOffset(0);
  }
}
