package irvine.oeis.a253;

import irvine.math.MemoryFunctionInt3;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A253095 Moments of 4-step random walk in 4 dimensions.
 * @author Georg Fischer
 */
public class A253095 extends Sequence0 {

  private int mN;
  private int mStep;

  /** Construct the sequence. */
  public A253095() {
    this(4);
  }

  /**
   * Generic constructor with parameters
   * @param step
   */
  public A253095(final int step) {
    mN = -1;
    mStep = step;
  }

  /* Maple:
    W := proc(n,nu,twok)
        option remember;
        local k;
        k := twok/2 ;
        if n = 2 and nu = 1 then
            binomial(2*k+2,k+1)/(k+2) ;
        else
            add( procname(n-1,nu, 2*j)*binomial(k,j)*(k+nu)!*nu!/(k-j+nu)!/(j+nu)!,j=0..k) ;
            # simplify(%,GAMMA) ;
        end if;
    end proc:
    A253095 := proc(n)
        W(4, 1,n) ;
    end proc:
    seq(A253095(2*n),n=0..25) ; # _R. J. Mathar_, Jun 14 2015
  */
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<Z>() {
    @Override
    protected Z compute(final int n, final int nu, final int twok) {
      final int k = twok / 2;
      if (n == 2 && nu == 1) {
        return Binomial.binomial(2 * k + 2, k + 1).divide(k + 2);
      }
      Z sum = Z.ZERO;
      for (int j = 0; j <= k; ++j) {
        sum = sum.add(get(n - 1, nu, 2 * j)
          .multiply(Binomial.binomial(k, j))
          .multiply(MemoryFactorial.SINGLETON.factorial(k + nu))
          .multiply(MemoryFactorial.SINGLETON.factorial(nu))
          .divide(MemoryFactorial.SINGLETON.factorial(k - j + nu))
          .divide(MemoryFactorial.SINGLETON.factorial(j + nu)));
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    ++mN;
    return mB.get(mStep, 1, 2 * mN);
  }
}
