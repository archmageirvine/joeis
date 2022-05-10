package irvine.oeis.a184;

import irvine.math.LongUtils;
import irvine.math.z.Euler;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A184271 Table read by antidiagonals: T(n,k) = number of distinct n X k toroidal binary arrays (n &gt;= 1, k &gt;= 1).
 * @author Georg Fischer
 */
public class A184271 extends UpperLeftTriangle {

  private Z mDim;

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

  /* PARI from A184277 (0..3 arrays):
    T(n, k) = (1/(n*k)) * sumdiv(n, c, sumdiv(k, d, eulerphi(c) * eulerphi(d) * 4^(n*k/lcm(c, d))));
  */
  @Override
  public Z matrixElement(final int n, final int k) {
    return Integers.SINGLETON.sumdiv(n, c -> Euler.phi(Z.valueOf(c)).multiply(
      Integers.SINGLETON.sumdiv(k, d -> Euler.phi(Z.valueOf(d)).multiply(mDim.pow(n * k / LongUtils.lcm(c, d)))))).divide(n * k);
  }
}
