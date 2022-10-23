package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000201;

/**
 * A026242 a(n) = j if n is L(j), else a(n) = k if n is U(k), where L = A000201, U = A001950 (lower and upper Wythoff sequences).
 * @author Sean A. Irvine
 */
public class A026242 extends Sequence1 {

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
