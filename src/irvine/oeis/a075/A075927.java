package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075927 Basis for code in A075926.
 * @author Sean A. Irvine
 */
public class A075927 extends A075926 {

  private long mN = 0;
  private long mM = 0;

  protected A075927(final int weight) {
    super(weight);
  }

  /** Construct the sequence. */
  public A075927() {
    this(3);
  }

  @Override
  public Z next() {
    mN = mN == 0 ? 1 : mN * 2;
    Z t = null;
    while (mM <= mN) {
      t = super.next();
      ++mM;
    }
    return t;
  }
}
