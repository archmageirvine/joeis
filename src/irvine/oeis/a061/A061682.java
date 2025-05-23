package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a003.A003285;

/**
 * A061682 Length of period of continued fraction expansion of square root of (2^(2n+1)+1).
 * @author Sean A. Irvine
 */
public class A061682 extends A003285 {

  /** Construct the sequence. */
  public A061682() {
    super(2);
  }

  private int mN = 1;

  @Override
  public Z next() {
    return a(Z.ONE.shiftLeft(2L * ++mN + 1).add(1));
  }
}

