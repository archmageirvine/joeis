package irvine.oeis.a067;

/**
 * A067973 a(n+1) is the smallest number &gt; a(n) such that the digits of a(n)^3 are all (with multiplicity) contained in the digits of a(n+1)^3, with a(0)=1.
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
