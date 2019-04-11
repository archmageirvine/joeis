package irvine.oeis.a001;

/**
 * A001300 Number of ways of making change for n cents using coins of <code>1, 5, 10, 25, 50</code> cents.
 * @author Sean A. Irvine
 */
public class A001300 extends A001312 {

  @Override
  protected int[] coins() {
    return new int[] {1, 5, 10, 25, 50};
  }
}
