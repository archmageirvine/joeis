package irvine.oeis.a001;

/**
 * A001313 Number of ways of making change for n cents using coins of 1, 2, 5, 10, 20, 50 cents.
 * @author Sean A. Irvine
 */
public class A001313 extends A001312 {

  @Override
  protected int[] coins() {
    return new int[] {1, 2, 5, 10, 20, 50};
  }
}
