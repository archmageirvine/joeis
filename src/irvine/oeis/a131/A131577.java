package irvine.oeis.a131;
// manually 2023-07-30

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A131577 Zero followed by powers of 2 (cf. A000079).
 * @author Georg Fischer
 */
public class A131577 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ZERO : Z.ONE.shiftLeft(mN - 1);
  }
}

