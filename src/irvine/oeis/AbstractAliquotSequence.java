package irvine.oeis;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * Generate an aliquot sequence.
 * @author Sean A. Irvine
 */
public abstract class AbstractAliquotSequence implements Sequence {

  private Z mA = null;

  private Z aliquot(final Z n) {
    if (Z.ONE.equals(n)) {
      return Z.ZERO;
    } else if (n.isProbablePrime()) {
      return Z.ONE;
    }
    return Jaguar.factor(n).sigma().subtract(n);
  }

  protected abstract Z start();

  @Override
  public Z next() {
    if (Z.ZERO.equals(mA)) {
      return null;
    }
    mA = mA == null ? start() : aliquot(mA);
    return mA;
  }
}
