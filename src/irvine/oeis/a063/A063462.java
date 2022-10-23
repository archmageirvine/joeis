package irvine.oeis.a063;
// manually 2021-08-15

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063462 n * last digit of n.
 * @author Georg Fischer
 */
public class A063462 extends Sequence0 {

  protected int mN;

  /** Construct the sequence. */
  public A063462() {
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN % 10).multiply(mN);
  }
}
