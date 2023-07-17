package irvine.oeis.a008;

import irvine.math.z.Z;

/**
 * A008283 Read across rows of Euler-Bernoulli or Entringer triangle.
 * @author Sean A. Irvine
 */
public class A008283 extends A008281 {

  /** Construct the sequence. */
  public A008283() {
    super(3);
  }

  private long mN = 2;
  private long mM = 2;

  @Override
  public Z next() {
    if (++mM >= mN - 1) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}

