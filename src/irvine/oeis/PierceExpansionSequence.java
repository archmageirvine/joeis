package irvine.oeis;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * The Pierce expansion of a real number.
 * @author Sean A. Irvine
 */
public abstract class PierceExpansionSequence implements Sequence {

  private CR mU = null;

  protected abstract CR getN();

  protected int precision() {
    return 32;
  }

  @Override
  public Z next() {
    mU = mU == null ? getN() : mU.divide(mU.subtract(CR.valueOf(mU.floor(precision()))));
    return mU.floor(precision());
  }
}
