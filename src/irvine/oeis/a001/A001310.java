package irvine.oeis.a001;

/**
 * A001310 Number of ways of making change for n cents using coins of <code>1, 2, 4, 10, 20, 40, 100</code> cents.
 * @author Sean A. Irvine
 */
public class A001310 extends A001312 {

  @Override
  protected int[] coins() {
    return new int[] {1, 2, 4, 10, 20, 40, 100};
  }
}
