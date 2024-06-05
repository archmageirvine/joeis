package irvine.oeis.a184;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A184271 Table read by antidiagonals: T(n,k) = number of distinct n X k toroidal binary arrays (n &gt;= 1, k &gt;= 1).
 * @author Georg Fischer
 */
public class A184271 extends UpperLeftTriangle {

  private final Z mDim;

  /** Construct the sequence. */
  public A184271() {
    this(2);
  }

  /**
   * Generic constructor with parameters
   * @param dim dimension of the array values (binary = 2).
   */
  public A184271(final int dim) {
    super(1, 1, -1);
    mDim = Z.valueOf(dim);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    final long t = (long) n * k;
    return Integers.SINGLETON.sumdiv(n, c -> Functions.PHI.z(c).multiply(
      Integers.SINGLETON.sumdiv(k, d -> Functions.PHI.z(d).multiply(mDim.pow(t / Functions.LCM.l(c, (long) d)))))).divide(t);
  }
}
