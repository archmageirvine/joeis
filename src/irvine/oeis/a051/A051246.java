package irvine.oeis.a051;

import irvine.oeis.a050.A050875;

/**
 * A051246 Binary numbers d(1)...d(j) such that d(i)=d(j+1-k) for all but 4 i.
 * @author Sean A. Irvine
 */
public class A051246 extends A050875 {

  @Override
  protected int target() {
    return 4;
  }
}
