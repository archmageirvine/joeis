package irvine.oeis.a001;

import irvine.oeis.a000.A000662;

/**
 * A001376.
 * @author Sean A. Irvine
 */
public class A001376 extends A000662 {

  @Override
  protected int t(final int[] s) {
    return super.t(s) * 2;
  }
}
