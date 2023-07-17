package irvine.oeis.a035;

import irvine.math.z.Z;

/**
 * A035524 Reverse and add (in base 4).
 * @author Sean A. Irvine
 */
public class A035524 extends A035342 {

  /** Construct the sequence. */
  public A035524() {
    super(0);
  }

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.add(new Z(new StringBuilder(mN.toString(4)).reverse(), 4));
    return mN;
  }
}

