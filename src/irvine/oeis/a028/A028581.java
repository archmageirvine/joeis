package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a024.A024011;

/**
 * A028581 Quotients associated with A024011.
 * @author Sean A. Irvine
 */
public class A028581 extends A024011 {

  @Override
  public Z next() {
    super.next();
    return mSum.divide(mP);
  }
}

