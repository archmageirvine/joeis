package irvine.oeis.a371;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a217.A217464;

/**
 * A371570 Number of binary necklaces of length n which have more 01 than 00 substrings.
 * @author Gregory Morse
 */
public class A371570 extends Sequence0 {
  private final Sequence mEqual = new A217464();
  private final Sequence mLess = new A371668().skip();
  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ZERO : Z.ONE.shiftLeft(mN).subtract(mEqual.next()).subtract(mLess.next());
  }
}
