package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034849 a(n) = 1 + 2*A034784(n).
 * @author Sean A. Irvine
 */
public class A034849 extends A034784 {

  @Override
  public Z next() {
    return super.next().multiply2().add(1);
  }
}
