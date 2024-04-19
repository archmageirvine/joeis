package irvine.oeis.a027;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A027487 Second column of triangle A027477, constructed from the Stirling numbers of the first kind.
 * @author Sean A. Irvine
 */
public class A027487 extends A027477 {

  /** Construct the sequence. */
  public A027487() {
    super(2);
  }

  private int mN = 1;

  {
    step();
  }

  @Override
  public Z next() {
    step();
    final int n = ++mN;
    final Z f = Functions.FACTORIAL.z(n).pow(power());
    return mMatrix.get(mN - 1, 1).multiply(f).toZ();
  }
}
