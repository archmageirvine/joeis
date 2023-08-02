package irvine.oeis.a080;
// manually A064437/parmof4 at 2022-12-29 14:08

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A080037 a(0)=2; for n &gt; 0, a(n) = n + floor(sqrt(4n-3)) + 2.
 * @author Georg Fischer
 */
public class A080037 extends AbstractSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A080037() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.TWO : Z.valueOf(4L * mN - 3).sqrt().add(mN + 2);
  }
}
