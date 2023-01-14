package irvine.oeis.a358;

import irvine.math.group.GaussianIntegers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A358432 Nonnegative integers m which can be represented using only 0's and 1's in the complex base 1+i, i.e., m = c(0) + c(1)*(1+i) + c(2)*(1+i)^2 + ... where each coefficient c(k) is either 0 or 1.
 * @author Sean A. Irvine
 */
public class A358432 extends Sequence1 {

  private static final GaussianIntegers G = GaussianIntegers.SINGLETON;
  private static final Pair<Z, Z> I1 = G.subtract(G.one(), G.i());
  private long mN = -1;

  private boolean is(final long t) {
    Pair<Z, Z> n = new Pair<>(Z.valueOf(t), Z.valueOf(t));
    while (!G.zero().equals(n)) {
      if (n.equals(G.i())) {
        return false;
      }
      if (n.left().testBit(0) == n.right().testBit(0)) {
        n = G.multiply(n, I1);
      } else {
        n = G.multiply(G.subtract(n, G.one()), I1);
      }
      n = new Pair<>(n.left().divide2(), n.right().divide2());
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

// PARI) is(n)= while (n, if (n==I, return (0), real(n)%2==imag(n)%2, n = n/(1+I), n = (n-1)/(1+I)); ); return (1); \\ Rémy Sigrist, Nov 16 2022
