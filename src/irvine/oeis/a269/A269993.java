package irvine.oeis.a269;

import java.util.function.Function;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A269993 Denominators of r-Egyptian fraction expansion for sqrt(1/2), where r = (1,1/2,1/3,1/4,...).
 * Suppose that r is a sequence of rational numbers r(k) <= 1 for k >= 1, and that x is an irrational number in (0, 1).
 * Let f(0) = x, n(k) = floor(r(k)/f(k-1)), and f(k) = f(k-1) - r(k)/n(k).
 * Then x = r(1)/n(1) + r(2)/n(2) + r(3)/n(3) + ... , the r-Egyptian fraction for x.
 * @author Georg Fischer
 */
public class A269993 extends AbstractSequence {

  private int mN;
  private final CR mX;
  private final Function<Integer, Z> mLambda;

  /** Construct the sequence. */
  public A269993() {
    this(1, CR.HALF.sqrt(), k -> Z.valueOf(k));
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param x start with this constant 
   * @param lambda expression for the running index <em>k</em>
   */
  public A269993(final int offset, final CR x, final Function<Integer, Z> lambda) {
    super(offset);
    mN = offset - 1;
    mX = x;
    mLambda = lambda;
  }

  /* PARI/GP:
    r(k) = 1/k;
    x = sqrt(1/2);
    f(x, k) = if(k<1, x, f(x, k - 1) - r(k)/n(x, k));
    n(x, k) = ceil(r(k)/f(x, k - 1));
    for(k = 1, 10, print("k=", k, ", r(k)=", r(k), ", x=", x, ", f(k)=", f(x, k), ", n(k)="n(x, k))) 
  */
  private CR f(final int k) {
    return (k < 1) ? mX : f(k - 1).subtract(CR.valueOf(new Q(Z.ONE, mLambda.apply(k))).divide(n(k)));
  }

  private Z n(final int k) {
   return CR.valueOf(new Q(Z.ONE, mLambda.apply(k))).divide(f(k - 1)).ceil();
  }

  @Override
  public Z next() {
    return n(++mN);
  }
}
