package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001148 Final digit of 3^n.
 * @author Sean A. Irvine
 */
public class A001148 implements Sequence {

  private static final Z[] SEQ = {Z.ONE, Z.THREE, Z.NINE, Z.SEVEN};
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mN &= 3;
    return SEQ[mN];
  }
}
