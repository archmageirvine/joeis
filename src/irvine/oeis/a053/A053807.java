package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a001.A001157;

/**
 * A053807 a(n) = Sum_{k=1..n, n mod k = 1} k^2.
 * @author Sean A. Irvine
 */
public class A053807 extends A001157 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    return super.next().subtract(1);
  }
}

