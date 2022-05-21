package irvine.oeis.a145;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A145609 Numerator of the polynomial A_l(x) = sum_{d=1..l-1} x^(l-d)/d for index l=2n+1 evaluated at x=1.
 * @author Georg Fischer
 */
public class A145609 implements Sequence {

  private int mN;
  private Z mX;
  private int mNumer;

  /** Construct the sequence. */
  public A145609() {
    this(1, 1);
  }

  /**
   * Generic constructor with parameters
   * @param numer 1 for numerator, otherwise denominator
   * @param x evaluate at this point
   */
  public A145609(final int numer, final int x) {
    mN = 0;
    mX = Z.valueOf(x);
    mNumer = numer;
  }

  /* Maple:
    A := proc(l, x) add(x^(l-d)/d, d=1..l-1) ; end: 
    A145609 := proc(n) numer( A(2*n+1, 1)) ; end: 
    seq(A145609(n), n=1..20)
  */
  @Override
  public Z next() {
    ++mN;
    Q sum = Q.ZERO;
    final int l = 2 * mN + 1;
    for (int d = 1; d < l; ++d) {
      sum = sum.add(new Q(mX.pow(l - d), Z.valueOf(d)));
    }
    return mNumer == 1 ? sum.num() : sum.den();
  }
}
