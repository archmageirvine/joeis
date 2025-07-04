package irvine.oeis.a226;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A226960 Numbers n such that 1^n + 2^n + 3^n +...+ n^n == 2 (mod n).
 * @author Georg Fischer
 */
public class A226960 extends AbstractSequence {

  private int mN;
  private long mRes;

  /** Construct the sequence. */
  public A226960() {
    this(1, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param res residue
   */
  public A226960(final int offset, final int res) {
    super(offset);
    mN = offset - 1;
    mRes = res;
  }

  @Override
  public Z next() {
    // f[n_] := Mod[Sum[PowerMod[k, n, n], {k, 1, n}] - 43, n];
    // For[n = 1, n < 80000, n++, If[f[n] == 0, Print[n]]] 
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (Integers.SINGLETON.sum(1, mN, k -> Z.valueOf(k).modPow(mN, n)).subtract(mRes).mod(mN) == 0L) {
        return n;
      }
    }
  }
}
