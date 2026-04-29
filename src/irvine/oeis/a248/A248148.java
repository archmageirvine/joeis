package irvine.oeis.a248;

import java.util.function.Function;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A248148 Least k such that r - sum{1/Binomial[2h, h], h = 0..k} &lt; 1/3^n, where r = 1/3 + 2*Pi/Sqrt(243).
 * @author Georg Fischer
 */
public class A248148 extends AbstractSequence {

  private long mN;
  private long mK;
  private final CR mR;
  private final long mH;
  private final Function<Long, Q> mLambdaH;
  private final Function<Long, Q> mLambdaN;

  /** Construct the sequence. */
  public A248148() {
    this(1, CR.valueOf(new Q(1, 3)).add(CR.PI.multiply(2).divide(CR.valueOf(243).sqrt())), 1, h -> new Q(Z.ONE, Binomial.binomial(2 * h, h)), n -> new Q(Z.ONE, Z.THREE.pow(n)));
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param r expression before the sum
   * @param h1 start of h
   * @param lambdaH lambda expression in h
   * @param lambdaN lambda expression in n
   */
  public A248148(final int offset, final CR r, final long h1, final Function<Long, Q> lambdaH, final Function<Long, Q> lambdaN) {
    super(offset);
    mN = offset - 1;
    mR = r;
    mLambdaH = lambdaH;
    mLambdaN = lambdaN;
    mK = 1;
    mH = h1;
  }

  @Override
  public Z next() {
    ++mN;
    mK = mH;
    final CR cn = CR.valueOf(mLambdaN.apply(mN));
    CR sum = mR.subtract(CR.valueOf(mLambdaH.apply(mK)));
//    System.out.println("A248148: mN=" + mN + ", mK=" + mK + ", mSum=" + mSum + ", cn=" + cn);
    while (sum.compareTo(cn) >= 0) {
//      System.out.println("A248148: mN=" + mN + ", mK=" + mK + ", mSum=" + mSum + ", cn=" + cn);
      sum = sum.subtract(CR.valueOf(mLambdaH.apply(++mK)));
    }
    return Z.valueOf(mK);
  }
}
