package irvine.oeis.a001;

/**
 * A001343 Number of (unordered) ways of making change for n cents using coins of 5, 10, 20, 50, 100 cents.
 * @author Sean A. Irvine
 */
public class A001343 extends A001312 {

  @Override
  protected int[] coins() {
    return new int[] {5, 10, 20, 50, 100};
  }
}
