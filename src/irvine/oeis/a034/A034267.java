package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034267 a(n)=f(n,n) where f is given in A034261.
 * @author Sean A. Irvine
 */
public class A034267 extends A034261 {

  /** Construct the sequence. */
  public A034267() {
    super(1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return f(++mN, mN);
  }
}

