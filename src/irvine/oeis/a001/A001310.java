package irvine.oeis.a001;

/**
 * A001310.
 * @author Sean A. Irvine
 */
public class A001310 extends A001312 {

  @Override
  protected int[] coins() {
    return new int[] {1, 2, 4, 10, 20, 40, 100};
  }
}
