package irvine.oeis.a051;

import irvine.oeis.a050.A050874;

/**
 * A051247 Binary numbers d(1)...d(j) such that d(i) = d(j+1-i) for all but 4 values of i.
 * @author Sean A. Irvine
 */
public class A051247 extends A050874 {

  @Override
  protected int target() {
    return 4;
  }
}
