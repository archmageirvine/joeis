package irvine.oeis.a112;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A112557 Smallest number of stones in Tchoukaillon (or Mancala, or Kalahari) solitaire which make use of (2*n-1)-th hole for n&gt;=1; a bisection of A002491.
 * @author Georg Fischer
 */
public class A112557 implements Sequence {

  private int mN;
  private final int mMult;

  /** Construct the sequence. */
  public A112557() {
    this(3);
  }

  /**
   * Generic constructor with parameter
   * @param mult multiple
   */
  public A112557(final int mult) {
    mN = 0;
    mMult = mult;
  }

  /**
   * Round-up routine, used in A113749.
   * @param n row index
   * @param k columns index
   * @return final value
   * PARI: a(n)=local(A=n, D); for(i=1, n-1, D=n-i; A=D*ceil(A/D+5)); A
   */
  public static Z roundUp(final int n, final int k) {
    Z a = Z.valueOf(n);
    for (int i = 1; i < n; ++i) {
      final Z d = Z.valueOf(n - i);
      a = d.multiply(new Q(a, d).add(k).ceiling());
    }
    return a;
  }

  @Override
  public Z next() {
    ++mN;
    return roundUp(mN, mMult - 1);
  }
}
