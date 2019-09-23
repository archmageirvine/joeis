package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000201;

/**
 * A026242 <code>a(n) =</code> j if n is <code>L(j)</code>, else <code>a(n) =</code> k if n is <code>U(k)</code>, where L <code>= A000201, U = A001950</code> (lower and upper Wythoff sequences).
 * @author Sean A. Irvine
 */
public class A026242 implements Sequence {

  private final Sequence mLSeq = new A000201();
  private long mL = mLSeq.next().longValueExact();
  private long mLi = 0;
  private long mUi = 0;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == mL) {
      mL = mLSeq.next().longValueExact();
      return Z.valueOf(++mLi);
    } else {
      return Z.valueOf(++mUi);
    }
  }
}
