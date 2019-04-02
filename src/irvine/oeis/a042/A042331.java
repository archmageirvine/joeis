package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042331 Denominators of continued fraction convergents to sqrt(692).
 * @author Sean A. Irvine
 */
public class A042331 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042331() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4999698, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 3, 10, 13, 36, 49, 85, 1069, 1154, 2223, 5600, 7823, 29069, 95030, 4970629, 15006917, 49991380, 64998297, 179987974, 244986271, 424974245, 5344677211L, 5769651456L, 11114328667L, 27998308790L, 39112637457L, 145336221161L, 475121300940L});
  }
}
