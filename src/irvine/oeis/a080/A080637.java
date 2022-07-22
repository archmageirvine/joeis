package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a007.A007378;

/**
 * A080637 a(n) is the smallest positive integer which is consistent with the sequence being monotonically increasing and satisfying a(1)=2, a(a(n)) = 2n+1 for n &gt; 1.
 * @author Sean A. Irvine
 */
public class A080637 extends A007378 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
