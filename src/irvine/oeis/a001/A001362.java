package irvine.oeis.a001;

/**
 * A001362.
 * @author Sean A. Irvine
 */
public class A001362 extends A001312 {

  @Override
  protected int[] coins() {
    return new int[] {1, 2, 4, 10};
  }
}
