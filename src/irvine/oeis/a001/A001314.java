package irvine.oeis.a001;

/**
 * A001314 Number of (unordered) ways of making change for n cents using coins of 2, 5 (two kinds), 10, 20, 50 cents.
 * @author Sean A. Irvine
 */
public class A001314 extends A001312 {

  @Override
  protected int[] coins() {
    return new int[] {2, 5, 5, 10, 20, 50};
  }
}
