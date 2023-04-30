package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a002.A002321;

/**
 * A063473 M(2*n-1), where M(n) is Mertens's function (A002321): Sum_{k=1..n} mu(k), where mu = Moebius function (A008683).
 * @author Sean A. Irvine
 */
public class A063473 extends A002321 {

  @Override
  public Z next() {
    final Z t = super.next();
    super.next();
    return t;
  }
}
