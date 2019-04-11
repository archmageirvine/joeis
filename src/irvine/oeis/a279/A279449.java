package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279449 Number of nonequivalent ways to place 5 points on <code>an n</code> X n square grid so that no more than 2 points are on a vertical or horizontal straight line.
 * @author Sean A. Irvine
 */
public class A279449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279449() {
    super(new long[] {1, -5, 4, 20, -40, -16, 100, -44, -110, 110, 44, -100, 16, 40, -20, -4, 5}, new long[] {0, 0, 9, 306, 4361, 34059, 185181, 777280, 2710074, 8181558, 22067973, 54285858, 123791067, 264749849, 536146569, 1035584592, 1919530804});
  }
}
