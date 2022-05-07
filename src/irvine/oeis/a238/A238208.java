package irvine.oeis.a238;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A238208 The total number of 1's in all partitions of n into an odd number of distinct parts.
 * @author Georg Fischer
 */
public class A238208 extends MemoryFunctionInt3<Z> implements Sequence {

  protected int mDigit;
  protected int mParity;
  protected int mN;

  /** Construct the sequence. */
  public A238208() {
    this(0, 1, 1);
  }

  /**
   * Constructor with parameters.
   * @param offset first index
   * @param digit count this digit
   * @param parity even=0, odd=1
   */
  public A238208(final int offset, final int digit, final int parity) {
    mN = offset - 1;
    mDigit = digit;
    mParity = parity;
  }

  /* Maple programs:
    # A238208:
    b:= proc(n, i, t) option remember; `if`(n=0, t,
     `if`(i>n, 0, b(n, i+1, t)+b(n-i, i+1, 1-t)))
    end:
    a:= n-> b(n-1, 2, 1):
    seq(a(n), n=0..100);  # Alois P. Heinz, May 01 2020
    
    # A238215:
    b:= proc(n, i, t) option remember; `if`(n=0, t,
     `if`(i>n, 0, b(n, i+1, t)+b(n-i, i+1, 1-t)))
    end:
    a:= n-> b(n-1, 2, 0):
    seq(a(n), n=0..100);  # Alois P. Heinz, May 01 2020
  */
  @Override
  protected Z compute(final int n, final int i, final int t) {
    if (n == 0) {
      return Z.valueOf(t);
    }
    return i > n ? Z.ZERO : get(n, i + 1, t).add(get(n - i, i + 1, mDigit - t));
  }

  @Override
  public Z next() {
    ++mN;
    return get(mN - 1, 2, mParity);
  }
}
