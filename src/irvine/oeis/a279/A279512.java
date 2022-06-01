package irvine.oeis.a279;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A279512 Sierpinski octahedron numbers a(n) = 2*6^n + 3*2^n + 1.
 * @author Sean A. Irvine
 */
public class A279512 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279512() {
    super(new long[] {12, -20, 9}, new long[] {6, 19, 85});
  }
}
