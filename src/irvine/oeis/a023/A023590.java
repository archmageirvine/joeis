package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023590.
 * @author Sean A. Irvine
 */
public class A023590 extends A000040 {

  @Override
  public Z next() {
    final Z[] p = Cheetah.factor(super.next().multiply2().add(1)).toZArray();
    return p[p.length - 1];
  }
}
