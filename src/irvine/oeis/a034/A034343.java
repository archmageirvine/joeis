package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a076.A076832;

/**
 * A034343 Number of inequivalent binary linear codes of length n and any dimension k &lt;= n containing no column of zeros.
 * @author Sean A. Irvine
 */
public class A034343 extends A076832 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, mN);
  }
}

