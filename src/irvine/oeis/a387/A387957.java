package irvine.oeis.a387;

import irvine.oeis.a390.A390217;

/**
 * A387957 Number of integer partitions of n with parts colored by {0, 1, 2, 3} such that the sum of colors is congruent to 1 (mod 4).
 * @author Sean A. Irvine
 */
public class A387957 extends A390217 {

  @Override
  protected boolean accept(final int sum) {
    return (sum & 3) == 1;
  }
}
