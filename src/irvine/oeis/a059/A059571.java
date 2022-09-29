package irvine.oeis.a059;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a002.A002321;

/**
 * A059571 From Mertens's conjecture (1): floor(sqrt(n)) - |M(n)|, where M is Mertens's function A002321.
 * @author Sean A. Irvine
 */
public class A059571 extends A002321 {

  @Override
  public Z next() {
    final Z t = super.next().abs();
    return Z.valueOf(LongUtils.sqrt(mN)).subtract(t);
  }
}
