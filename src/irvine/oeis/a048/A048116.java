package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048116 a(n) = T(2n,n), where T is given by A048113.
 * @author Sean A. Irvine
 */
public class A048116 extends A048113 {

  /** Construct the sequence. */
  public A048116() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
