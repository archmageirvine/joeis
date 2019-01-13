package irvine.oeis.a008;

/**
 * A008932.
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
