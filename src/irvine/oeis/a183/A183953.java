package irvine.oeis.a183;

import java.util.function.BiFunction;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A183953 T(n,k) is the number of strings of numbers x(i=1..n) in 0..k with sum i^2*x(i) equal to k*n^2.
 * @author Georg Fischer
 */
public class A183953 extends UpperLeftTriangle {

  protected BiFunction<Integer, Integer, Integer> mEx12;

  /** Construct the sequence. */
  public A183953() {
    this((n, k) -> n * n * k);
  }

  /**
   * Generic constructor with parameters
   * @param ex12 parameter
   */
  public A183953(final BiFunction<Integer, Integer, Integer> ex12) {
    super(1, 1, -1);
    hasRAM(true);
    mEx12 = ex12;
  }

  /* Maple:
    A183953rec := proc(n, k, s) option remember; local c;
        if s < 0 then return 0 ;
        elif n = 0 then if s =0 then return 1; else return 0 ; end if;
        else
            add( procname(n-1, k, s-c*n^2), c=0..k) ;
        end if;
    end proc:
    A183953 := proc(n, k)
        A183953rec(n, k, k*n^2) ;
    end proc:
    seq(seq( A183953(n, d-n), n=1..d-1), d=2..12) ; # R. J. Mathar, Mar 08 2021
  */
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int k, final int s) {
      if (s < 0) {
        return Z.ZERO;
      }
      if (n == 0) {
        return s == 0 ? Z.ONE : Z.ZERO;
      }
      Z sum = Z.ZERO;
      for (int c = 0; c <= k; ++c) {
        sum = sum.add(get(n - 1, k, s - mEx12.apply(n, c)));
      }
      return sum;
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return mB.get(n, k, mEx12.apply(n, k));
  }
}
