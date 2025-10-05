package irvine.oeis.a080;

import irvine.math.z.Z;

/**
 * A080935 Triangle read by rows of number of Catalan paths (nonnegative, starting and ending at 0, step +/-1) of 2n steps with all values less than or equal to k.
 * @author Sean A. Irvine
 */
public class A080935 extends A080934 {

  /** Construct the sequence. */
  public A080935() {
    super(1);
  }

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(2 * mN, 0, mM + 1);
  }
}

