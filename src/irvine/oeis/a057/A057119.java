package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A057119 Iterative "rewrite" sequence of binary plane trees.
 * @author Sean A. Irvine
 */
public class A057119 extends Sequence0 {

  private Z mA = null;

  private static int lg(final Z n) {
    return n.bitLength() - 1;
  }

  private static Z btdf2t(final Z n, final int ii) {
    int i = ii;
    final Z i2 = Z.ONE.shiftLeft(i);
    if (n.compareTo(i2) >= 0) {
      final Z x = btdf2t(n.subtract(i2), i - 1);
      i -= (lg(x) + 1) / 2;
      final Z y = btdf2t(n.mod(Z.ONE.shiftLeft(i)), i - 1);
      return x.add(Z.ONE.shiftLeft(lg(x) + 1)).shiftLeft(lg(y) + 2).add(y.multiply2());
    } else {
      return Z.TWO;
    }
  }

  static Z bintreeDepthFirst2Tree(final Z n) {
    return btdf2t(n.multiply2(), lg(n) + 1).divide2().subtract(Z.ONE.shiftLeft(2L * (lg(n) + 1)));
  }

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : bintreeDepthFirst2Tree(mA);
    return mA;
  }
}
