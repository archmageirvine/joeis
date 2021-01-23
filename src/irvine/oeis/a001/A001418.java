package irvine.oeis.a001;

/**
 * A001418 Number of ways of folding an n X n sheet of stamps.
 * @author Sean A. Irvine
 */
public class A001418 extends A001415 {

  {
    next(); // skip 0th term
  }

  @Override
  protected int[] getDimensions(final int n) {
    return new int[] {n, n};
  }
}
