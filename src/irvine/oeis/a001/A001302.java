package irvine.oeis.a001;

/**
 * A001302.
 * @author Sean A. Irvine
 */
public class A001302 extends A001312 {

  @Override
  protected int[] coins() {
    return new int[] {1, 2, 5, 10, 25, 50};
  }
}
