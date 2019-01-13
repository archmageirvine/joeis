package irvine.oeis.a001;

/**
 * A001313.
 * @author Sean A. Irvine
 */
public class A001313 extends A001312 {

  @Override
  protected int[] coins() {
    return new int[] {1, 2, 5, 10, 20, 50};
  }
}
