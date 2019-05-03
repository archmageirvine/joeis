package irvine.oeis.a001;

/**
 * A001301 Number of ways of making change for n cents using coins of <code>1, 2, 5, 10, 25</code> cents.
 * @author Sean A. Irvine
 */
public class A001301 extends A001312 {

  @Override
  protected int[] coins() {
    return new int[] {1, 2, 5, 10, 25};
  }
}
