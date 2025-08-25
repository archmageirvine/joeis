package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034274 a(n)=f(n,n-1) where f is given in A034261.
 * @author Sean A. Irvine
 */
public class A034274 extends A034261 {

  /** Construct the sequence. */
  public A034274() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return f(++mN, mN - 1);
  }
}

