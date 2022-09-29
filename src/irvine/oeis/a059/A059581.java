package irvine.oeis.a059;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a002.A002321;

/**
 * A059581 From Von Sterneck's conjecture: floor(sqrt(n)) - 2*|Mertens's function A002321(n)|.
 * @author Sean A. Irvine
 */
public class A059581 extends A002321 {

  @Override
  public Z next() {
    final Z t = super.next().abs().multiply2();
    return Z.valueOf(LongUtils.sqrt(mN)).subtract(t);
  }
}
