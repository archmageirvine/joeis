package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005580 Least number of distinct prime factors in odd numbers having an abundancy index &gt; n.
 * @author Sean A. Irvine
 */
public class A005580 extends A005579 {

  @Override
  public Z next() {
    final Z res = super.next().subtract(1).max(Z.ZERO);
    super.next();
    return res;
  }
}

