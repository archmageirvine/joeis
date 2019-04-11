package irvine.oeis.a001;

/**
 * A001364 Number of ways of making change for n cents using coins of <code>1, 2, 4, 12, 24, 48, 96, 120</code> cents (based on English coinage of <code>1939)</code>.
 * @author Sean A. Irvine
 */
public class A001364 extends A001312 {

  @Override
  protected int[] coins() {
    return new int[] {1, 2, 4, 12, 24, 48, 96, 120};
  }
}
