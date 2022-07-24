package irvine.oeis.a112;

import irvine.math.z.Z;
import irvine.oeis.a058.A058088;

/**
 * A112145 McKay-Thompson series of class 8c for the Monster group.
 * @author Sean A. Irvine
 */
public class A112145 extends A058088 {

  @Override
  public Z next() {
    final Z t = super.next();
    return (mN & 1) == 1 ? t.negate() : t;
  }
}
