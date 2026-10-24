package irvine.oeis.a290;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A290746 Total number of distinct Lyndon factors appearing in all words of length n over an alphabet of size 2.
 * @author Georg Fischer
 */
public class A290746 extends Sequence1 {

  private int mN;
  private final int mS;

  /** Construct the sequence. */
  public A290746() {
    this(2);
  }

  /**
   * Generic constructor with parameters
   * @param s size of the alphabet
   */
  public A290746(final int s) {
    mN = 0;
    mS = s;
  }

  private Z inner(final int m) {
    return Integers.SINGLETON.sumdiv(m, d -> Z.valueOf(mS).pow(d).multiply(Functions.MOBIUS.i(m / d)));
  }

  protected Z lyndon(final int n) {
    return Integers.SINGLETON.sum(1, n, m -> Z.valueOf(mS).pow(n - m).multiply(n - m + 1).multiply(inner(m.intValue())).divide(m));
  }

  @Override
  public Z next() {
    return lyndon(++mN);
  }
}
