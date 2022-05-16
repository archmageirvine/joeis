package irvine.oeis.a193;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A193515 T(n,k) = number of ways to place any number of 3X1 tiles of k distinguishable colors into an nX1 grid.
 * @author Georg Fischer
 */
public class A193515 extends UpperLeftTriangle {

  private int mDim;

  /** Construct the sequence. */
  public A193515() {
    this(3);
  }

  /**
   * Generic cosntructor with parameter.
   * @param dim row dimension of tiles
   */
  public A193515(final int dim) {
    super(1, 1, -1);
    hasRAM(true);
    mDim = dim;
  }

  /* Maple:
    T:= proc(n, k) option remember;
          `if`(n<0, 0,
          `if`(n<3 or k=0, 1, k*T(n-3, k) +T(n-1, k)))
        end:
    seq(seq(T(n, d+1-n), n=1..d), d=1..13); # _Alois P. Heinz_, Jul 29 2011
  */
  private final MemoryFunction2<Integer, Z> mB = new MemoryFunction2<Integer, Z>() {
    @Override
    protected Z compute(final Integer n, final Integer k) {
      if (n < 0) {
        return Z.ZERO;
      }
      if (n < mDim || k == 0) {
        return Z.ONE;
      }
      return get(n - mDim, k).multiply(k).add(get(n - 1, k));
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return mB.get(n, k);
  }
}
