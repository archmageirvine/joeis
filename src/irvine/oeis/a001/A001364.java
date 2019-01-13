package irvine.oeis.a001;

/**
 * A001364.
 * @author Sean A. Irvine
 */
public class A001364 extends A001312 {

  @Override
  protected int[] coins() {
    return new int[] {1, 2, 4, 12, 24, 48, 96, 120};
  }
}
