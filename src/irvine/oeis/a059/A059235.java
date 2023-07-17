package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059235 The array in A059219 read by antidiagonals in the direction in which it was constructed.
 * @author Sean A. Irvine
 */
public class A059235 extends A059219 {

  /** Construct the sequence. */
  public A059235() {
    super(1);
  }

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, (mN & 1) == 1 ? mM : mN - mM);
  }
}
