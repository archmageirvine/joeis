package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038161 (A038590-1)/6.
 * @author Sean A. Irvine
 */
public class A038161 extends A038590 {

  @Override
  public Z next() {
    return super.next().subtract(1).divide(6);
  }
}
