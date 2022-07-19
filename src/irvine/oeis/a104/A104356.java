package irvine.oeis.a104;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A104356 Smallest m such that A104350(m) has exactly n trailing zeros in decimal representation.
 * a(n) = if n=0 then 1 else (if n&lt;5 then 5*n else 2^n).
 * @author Georg Fischer
 */
public class A104356 implements Sequence {

  private int mN;

  /** Construct the sequence. */
  public A104356() {
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    if (mN < 5) {
      return Z.FIVE.multiply(mN);
    }
    return Z.ONE.shiftLeft(mN);
  }
}
