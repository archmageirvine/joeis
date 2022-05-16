package irvine.oeis.a323;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A323224 A(n, k) = [x^k] C^n*x/(1 - x) where C = 2/(1 + sqrt(1 - 4*x)), square array read by ascending antidiagonals with n &gt;= 0 and k &gt;= 0.
 * @author Georg Fischer
 */
public class A323224 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A323224() {
    super(0, 0, 1); // ascending
    hasRAM(true);
  }

  /* Maple:
    B := proc(n, k) option remember; if n <= 0 or k < 0 then 0
    elif n = k then 1 else B(n-1, k) + B(n, k-1) fi end:
    A := (n, k) -> B(n + k, k): seq(lprint(seq(A(n, k), k=0..9)), n=0..9);
  */
  private final MemoryFunction2<Integer, Z> mB = new MemoryFunction2<Integer, Z>() {
    @Override
    protected Z compute(final Integer n, final Integer k) {
      if (n <= 0 || k < 0) {
        return Z.ZERO;
      }
      if (n.equals(k)) {
        return Z.ONE;
      }
      return get(n - 1, k).add(get(n, k - 1));
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return mB.get(n + k, k);
  }
}
