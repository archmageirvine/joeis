package irvine.oeis.a001;

/**
 * A001300.
 * @author Sean A. Irvine
 */
public class A001300 extends A001312 {

  @Override
  protected int[] coins() {
    return new int[] {1, 5, 10, 25, 50};
  }
}
