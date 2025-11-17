package irvine.oeis.a387;

import irvine.oeis.a390.A390217;

/**
 * A387957 allocated for Thomas Hutton.
 * @author Sean A. Irvine
 */
public class A387957 extends A390217 {

  @Override
  protected boolean accept(final int sum) {
    return (sum & 3) == 1;
  }
}
