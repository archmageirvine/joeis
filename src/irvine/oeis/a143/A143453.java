package irvine.oeis.a143;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A143453 Square array A(n,k) of numbers of length n ternary words with at least k 0-digits between any other digits (n,k &gt;= 0), read by antidiagonals.
 * @author Georg Fischer
 */
public class A143453 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A143453() {
    super(0, 0, -1);
    hasRAM(true);
  }

  /* Maple:
    A := proc (n::nonnegint, k::nonnegint) option remember; 
      if k=0 then 3^n elif n<=k+1 then 2*n+1 else A(n-1, k) +2*A(n-k-1, k) fi end: 
      seq(seq(A(n,d-n), n=0..d), d=0..14);
  */
  private final MemoryFunction2<Integer, Z> mB = new MemoryFunction2<>() {
    @Override
    protected Z compute(final Integer n, final Integer k) {
      if (k == 0) {
        return Z.THREE.pow(n);
      }
      if (n <= k + 1) {
        return Z.valueOf(2L * n + 1);
      }
      return get(n - 1, k).add(get(n - k - 1, k).multiply2());
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return mB.get(n, k);
  }
}
