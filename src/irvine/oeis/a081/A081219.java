package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081219 One sixtieth the product of primitive Pythagorean triangles' sides whose odd values differ by 2.
 * @author Sean A. Irvine
 */
public class A081219 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081219() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 34, 259, 1092, 3333, 8294});
  }
}
