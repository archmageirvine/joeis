package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a023.A023271;

/**
 * A046124 Last member of a sexy prime quadruple: value of p+18 such that p, p+6, p+12 and p+18 are all prime.
 * @author Sean A. Irvine
 */
public class A046124 extends A023271 {

  @Override
  public Z next() {
    return super.next().add(18);
  }
}
