package irvine.oeis.a035;

import irvine.math.z.Z;

/**
 * A035523 Reverse and add (in base 3).
 * @author Sean A. Irvine
 */
public class A035523 extends A035342 {

  /** Construct the sequence. */
  public A035523() {
    super(0);
  }

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.add(new Z(new StringBuilder(mN.toString(3)).reverse(), 3));
    return mN;
  }
}

