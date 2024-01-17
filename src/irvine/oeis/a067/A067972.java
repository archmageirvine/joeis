package irvine.oeis.a067;

import irvine.math.z.Z;

/**
 * A067972 a(n+1) is the smallest cube &gt; a(n) such that the digits of a(n) are all (with multiplicity) properly contained in the digits of a(n+1), with a(0)=1.
 * @author Sean A. Irvine
 */
public class A067972 extends A067971 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
