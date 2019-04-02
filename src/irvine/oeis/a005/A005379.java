package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005379 The male of a pair of recurrences.
 * @author Sean A. Irvine
 */
public class A005379 extends A005378 {

  @Override
  protected Z getTerm(final int n) {
    return mMale.get(n);
  }
}
