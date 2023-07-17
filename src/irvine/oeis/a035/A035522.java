package irvine.oeis.a035;

import irvine.math.z.Z;

/**
 * A035522 Reverse and add (in binary) - written in base 10.
 * @author Sean A. Irvine
 */
public class A035522 extends A035342 {

  /** Construct the sequence. */
  public A035522() {
    super(0);
  }

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.add(new Z(new StringBuilder(mN.toString(2)).reverse(), 2));
    return mN;
  }
}

