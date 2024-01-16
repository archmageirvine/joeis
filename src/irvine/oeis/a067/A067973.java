package irvine.oeis.a067;

/**
 * A067968.
 * @author Sean A. Irvine
 */
public class A067973 extends A067971 {

  @Override
  protected boolean lt(final int[] a, final int[] b) {
    for (int k = 0; k < a.length; ++k) {
      if (a[k] > b[k]) {
        return false;
      }
    }
    return true;
  }
}
