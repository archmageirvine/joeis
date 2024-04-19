package irvine.oeis.a027;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A027481 Second subdiagonal of triangle A027477, constructed from the Stirling numbers of the first kind.
 * @author Sean A. Irvine
 */
public class A027481 extends A027477 {

  /** Construct the sequence. */
  public A027481() {
    super(3);
  }

  private int mN = 2;

  {
    step();
    step();
  }

  @Override
  public Z next() {
    step();
    final int n = ++mN;
    final Z f = Functions.FACTORIAL.z(n).pow(power());
    return mMatrix.get(mN - 1, mN - 3).multiply(f).toZ();
  }
}
