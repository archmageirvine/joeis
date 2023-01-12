package irvine.oeis.a068;
// manually andiv 

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A068475 a(n) = Sum_{m=0..n} m*n^(m-1).
 * @author Georg Fischer
 */
public class A068475 extends AbstractSequence {

  private int mN;

  /** Construct the sequence. */
  public A068475() {
    super(0);
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    return mN == 0 ? Z.ZERO : Integers.SINGLETON.sum(0, mN,
      m -> m == 0 ? Z.valueOf(m).divide(mN) : Z.valueOf(mN).pow(m - 1).multiply(m));
  }
}
