package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031973 a(n) = Sum_{k=0..n} n^k.
 * @author Sean A. Irvine
 */
public class A031973 extends A031972 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
