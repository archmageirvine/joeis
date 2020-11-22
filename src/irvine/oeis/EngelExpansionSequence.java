package irvine.oeis;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * The Engel expansion of a real number.
 * Recoded from A014012 of Sean Irvine.
 * @author Georg Fischer
 */
public abstract class EngelExpansionSequence implements Sequence {

  private CR mA = getN();

  protected abstract CR getN();

  protected int precision() {
    return 10000;
  }

  @Override
  public Z next() {
    final Z a = mA.inverse().ceil();
    mA = mA.multiply(a).subtract(CR.ONE);
    return a;
  }
}
