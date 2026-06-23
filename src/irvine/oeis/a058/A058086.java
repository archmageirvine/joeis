package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058086 a(n) = A058057(n,n-6).
 * @author Sean A. Irvine
 */
public class A058086 extends A058057 {

  /** Construct the sequence. */
  public A058086() {
    super(6);
  }

  private int mN = 5;

  @Override
  public Z next() {
    return t(++mN, mN - 6);
  }
}

