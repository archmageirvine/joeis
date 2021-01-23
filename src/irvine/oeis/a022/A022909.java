package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022909 The sequence m(n) in A022906.
 * @author Sean A. Irvine
 */
public class A022909 extends A022906 {

  @Override
  public Z next() {
    super.next();
    return mMin;
  }
}
