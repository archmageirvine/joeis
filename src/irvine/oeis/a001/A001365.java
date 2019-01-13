package irvine.oeis.a001;

/**
 * A001365.
 * @author Sean A. Irvine
 */
public class A001365 extends A001312 {

  @Override
  protected int[] coins() {
    return new int[] {1, 1, 2, 6, 12, 24, 48, 60};
  }
}
