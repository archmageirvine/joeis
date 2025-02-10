package irvine.math.function;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * Global Catalan rank function.
 * Used by a great many sequences from Antti Karttunen.
 * @author Sean A. Irvine
 */
class GlobalCatalanRank extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    final int len = n.bitLength() / 2;
    return Integers.SINGLETON.sum(0, len - 1, Functions.CATALAN::z).add(Functions.LOCAL_CATALAN_RANK.z(len, n));
  }
}
