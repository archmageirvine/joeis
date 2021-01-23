package irvine.oeis.a001;

/**
 * A001416 Number of ways of folding a 3 X n strip of stamps.
 * @author Sean A. Irvine
 */
public class A001416 extends A001415 {

  @Override
  protected int[] getDimensions(final int n) {
    return new int[] {n, 3};
  }
}
