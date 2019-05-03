package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a000.A000629;

/**
 * A007047 Number of chains in power set of <code>n-set</code>.
 * @author Sean A. Irvine
 */
public class A007047 extends A000629 {

  @Override
  public Z next() {
    return super.next().multiply2().subtract(1);
  }
}
