package irvine.oeis.a115;
// manually A115422/parmof4 at 2021-11-15 10:23

import irvine.math.z.Z;

/**
 * A115768 Integers i such that 2*i XOR 5*i = 3*i, but 4*i XOR i is not 5*i.
 * @author Georg Fischer
 */
public class A115768 extends A115422 {

  /** Construct the sequence. */
  public A115768() {
    super(1, 2, 5, 3);
  }

  @Override
  public Z next() {
    ++mN;
    while (((mF1 * mN) ^ (mF2 * mN)) != mF3 * mN || ((4 * mN) ^ mN) == 5 * mN) {
      ++mN;
    }
    return Z.valueOf(mN);
  }
}
