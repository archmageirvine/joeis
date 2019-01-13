package irvine.oeis.a001;

import java.io.Serializable;
import irvine.math.z.Z;
import irvine.oeis.a000.A000186;

/**
 * A001627.
 * @author Sean A. Irvine
 */
public class A001627 extends A000186 implements Serializable {

  private int mN = -1;
  private Z mMu1 = super.next();
  private final A001626 mDeltaSeq = new A001626();

  @Override
  public Z next() {
    final Z mu0 = mMu1;
    mMu1 = super.next();
    if (++mN == 0) {
      return Z.ONE;
    }
    return mu0.add(mMu1).add(mDeltaSeq.next().multiply(mN).multiply(3));
  }
}

