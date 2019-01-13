package irvine.oeis.a001;

/**
 * A001319.
 * @author Sean A. Irvine
 */
public class A001319 extends A001312 {

  @Override
  protected int[] coins() {
    return new int[] {2, 5, 10, 20, 50};
  }
}
