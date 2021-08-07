package irvine.oeis.a050;
// manually 2021-08-07

import irvine.math.z.Z;
import irvine.oeis.a049.A049884;

/**
 * A050024 a(n) = a(n-1) + a(m) for n &gt;= 4, where m = 2 * n - 3 - 2^(p+1) and p is the smallest integer such that 2^p &lt; n - 1 &lt;= 2^(p+1), starting with a(1) = a(2) = a(3) = 1.
 * and p is the smallest integer such that 2^p &lt; n - 1 &lt;= 2^(p+1), 
 * starting with a(1) = a(2) = a(3) = 1.
 * @author Georg Fischer
 */
public class A050024 extends A049884 {

  /** Construct the sequence. */
  public A050024() {
    this(1, 1, 1, 1);
  }

  /**
   * Generic constructor with parameter
   * @param initList sign of a(m) followed by the inital values for a(1), a(2) and so on
   */
  public A050024(final int ... initList) {
    super(initList);
  }

  /**
   * Gets <code>m = 2 * n - 3 - p1(n)</code>
   * @param n index
   * @return m
   */
  public int getM(final int n) {
    return 2 * n - 3 - p1(n);
  }

  @Override
  public Z next() {
    ++mN;
    if (mN < mLen) {
      final Z an = mA.get(mN);
      mSum = an;
      return an;
    }
    final Z result = mSign < 0 ? mSum.subtract(mA.get(getM(mN))) : mSum.add(mA.get(getM(mN)));
    mA.add(result);
    mSum = result;
    return result;
  }
}
