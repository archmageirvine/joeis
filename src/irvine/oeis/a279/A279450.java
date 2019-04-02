package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279450 Number of nonequivalent ways to place 6 points on an n X n square grid so that no more than 2 points are on a vertical or horizontal straight line.
 * @author Sean A. Irvine
 */
public class A279450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279450() {
    super(new long[] {1, -6, 8, 22, -69, 8, 176, -168, -182, 364, 0, -364, 182, 168, -176, -8, 69, -22, -8, 6}, new long[] {0, 0, 2, 285, 9110, 126396, 1055025, 6266614, 29198740, 113262680, 380775248, 1140764611, 3108667306L, 7824370092L, 18407341855L, 40855872764L, 86201399496L, 173952773328L, 337453762782L, 631982899545L});
  }
}
