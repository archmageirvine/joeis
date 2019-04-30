package irvine.oeis.a008;

/**
 * A008932 Number of increasing sequences of Goldbach type of length <code>n; a(0) = 1</code> by convention.
 * @author Sean A. Irvine
 */
public class A008932 extends A008933 {

  @Override
  protected void search(final int[] chain, final int pos) {
    if (A008929.isGoldbach(chain, pos)) {
      super.search(chain, pos);
    }
  }
}
