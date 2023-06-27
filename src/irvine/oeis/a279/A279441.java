package irvine.oeis.a279;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A279441 Number of ways to place 7 points on an n X n square grid so that no more than 2 points are on a vertical or horizontal straight line.
 * @author Sean A. Irvine
 */
public class A279441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279441() {
    super(1, new long[] {1, -15, 105, -455, 1365, -3003, 5005, -6435, 6435, -5005, 3003, -1365, 455, -105, 15}, new long[] {0, 0, 0, 816, 93000, 2602800, 35526120, 309328320, 1972234656, 9989784000L, 42369069600L, 155993500080L, 511660972680L, 1524225598896L, 4185197289000L});
  }
}
