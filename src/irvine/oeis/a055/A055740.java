package irvine.oeis.a055;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A055740 Sum of fourth powers of coefficients in full expansion of (z1+z2+...+zn)^n.
 * @author Sean A. Irvine
 */
public class A055740 extends MemoryFunction2Sequence<Integer, Q> implements DirectSequence {

  // After Alois P. Heinz

  private int mN;
  private int mExpon; // 1 less than the exponent in the name

  /** Construct the sequence. */
  public A055740() {
    this(0, 4);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param expon exponent
   */
  public A055740(final int offset, final int expon) {
    super(offset);
    mN = offset - 1;
    mExpon = expon - 1;
  }

  /* Maple:
     b:= proc(n, i) option remember; `if`(n=0, 1, `if`(i<1, 0,
        add(b(n-j, i-1)*binomial(n, j)^3/j!, j=0..n)))
     end:
     a:= n-> n!*b(n$2):
  */
  @Override
  protected Q compute(final Integer n, final Integer i) {
    if (n == 0) {
      return Q.ONE;
    }
    if (i < 1) {
      return Q.ZERO;
    }
    return Rationals.SINGLETON.sum(0, n, j -> get(n - j.intValue(), i - 1).multiply(Binomial.binomial(n, j).pow(mExpon)).divide(Functions.FACTORIAL.z(j)));
  }

  @Override
  public Z next() {
    ++mN;
    return get(mN, mN).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }

  @Override
  public Z a(final Z n) {
    return a(n.longValueExact());
  }

  @Override
  public Z a(final long n) {
    return get((int) n, (int) n).multiply(Functions.FACTORIAL.z(n)).toZ();
  }
}
