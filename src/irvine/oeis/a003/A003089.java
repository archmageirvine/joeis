package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a002.A002905;

/**
 * A003089.
 * @author Sean A. Irvine
 */
public class A003089 extends A002905 {

  {
    super.next(); // skip 0th term
  }

  @Override
  public Z next() {
    final Z t = super.next();
    return mN == 4 ? Z.TWO : t;
  }
}
