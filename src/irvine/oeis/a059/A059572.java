package irvine.oeis.a059;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a002.A002321;

/**
 * A059572 From Mertens's conjecture (2): floor(sqrt(n)) - Mertens's function A002321(n).
 * @author Sean A. Irvine
 */
public class A059572 extends A002321 {

  @Override
  public Z next() {
    final Z t = super.next();
    return Z.valueOf(LongUtils.sqrt(mN)).subtract(t);
  }
}
