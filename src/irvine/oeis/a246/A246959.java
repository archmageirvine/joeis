package irvine.oeis.a246;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A246959 Numbers of (undirected) Hamiltonian cycles in the n-Sierpi\u0144ski sieve graph.
 * <code>Join[{1, 1}, RecurrenceTable[{a[3] == 8, a[n] == (3 a[n - 1])^3}, a, {n, 3, 8}]]</code>
 * @author Georg Fischer
 */
public class A246959 extends Sequence1 {

  private int mN;
  private Z mA;

  /** Construct the sequence. */
  public A246959() {
    mN = 0;
    mA = Z.EIGHT;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN <= 2) {
      return Z.ONE;
    } else if (mN == 3) {
      return mA;
    }
    mA = mA.multiply(3).pow(3);
    return mA;
  }
}
