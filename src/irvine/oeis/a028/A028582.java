package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a024.A024011;

/**
 * A028582 Dividends associated with <code>A024011</code>.
 * @author Sean A. Irvine
 */
public class A028582 extends A024011 {

  @Override
  public Z next() {
    super.next();
    return mSum;
  }
}

