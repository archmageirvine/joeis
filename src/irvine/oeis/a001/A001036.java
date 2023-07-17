package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001036 Partial sums of A001037, omitting A001037(1).
 * @author Sean A. Irvine
 */
public class A001036 extends A001037 {

  /** Construct the sequence. */
  public A001036() {
    super(1);
  }

  private Z mSum = null;

  @Override
  public Z next() {
    if (mSum == null) {
      super.next();
      super.next();
      mSum = Z.ONE;
    } else {
      mSum = mSum.add(super.next());
    }
    return mSum;
  }
}
