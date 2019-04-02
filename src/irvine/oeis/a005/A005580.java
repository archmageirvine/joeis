package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005580 Least number of distinct prime factors in odd numbers having an abundancy index &gt; n.
 * @author Sean A. Irvine
 */
public class A005580 extends A005579 {

  {
    super.next();
  }

  @Override
  public Z next() {
    super.next();
    return super.next().subtract(1);
  }
}

