package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000108;

/**
 * A029887 A sum over scaled A000531 related to Catalan numbers C(n).
 * @author Sean A. Irvine
 */
public class A029887 implements Sequence {

  private int mN = -1;
  private final A000108 mSeq = new A000108();

  @Override
  public Z next() {
    ++mN;
    final int u = 2 * mN + 1;
    return mSeq.next().multiply(u).multiply(u + 2).multiply(u + 4)
      .divide(3)
      .subtract(Z.valueOf(mN + 2).shiftLeft(u));
  }
}

