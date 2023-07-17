package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007752 Odd bisection of A007750.
 * @author Sean A. Irvine
 */
public class A007752 extends A007750 {

  /** Construct the sequence. */
  public A007752() {
    super(1);
  }

  @Override
  public Z next() {
    super.next();
    return super.next();
  }
}

