package irvine.oeis.a339;

import irvine.math.MemoryFunctionInt3;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A339101 Number of compositions (ordered partitions) of n into distinct parts &gt;= 3.
 * @author Georg Fischer
 */
public class A339101 extends AbstractSequence {

  private int mN;
  private final int mNpart;

  /** Construct the sequence. */
  public A339101() {
    this(0, 3);
  }

  /**
   * Generic constructor with parameter
   * @param offset first index
   * @param npart number of parts
   */
  public A339101(final int offset, final int npart) {
    super(offset);
    mNpart = npart;
    mN = offset - 1;
  }

  /* Maple:
    b:= proc(n, i, p) option remember;
          `if`(n=0, p!, `if`((i-8)*(i+9)/2<n, 0,
           add(b(n-i*j, i-1, p+j), j=0..min(1, n/i))))
        end:
    a:= n-> b(n$2, 0):
    seq(a(n), n=0..69);  # _Alois P. Heinz_, Nov 23 2020
  */
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int i, final int p) {
      if (n == 0) {
        return MemoryFactorial.SINGLETON.factorial(p);
      }
      if ((i - mNpart + 1) * (i + mNpart) / 2 < n) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      final int ni = n / i;
      final int jmax = Math.min(1, ni);
      for (int j = 0; j <= jmax; ++j) {
        sum = sum.add(get(n - i * j, i - 1, p + j));
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    ++mN;
    return mB.get(mN, mN, 0);
  }
}
