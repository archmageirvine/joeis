package irvine.oeis.a225;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A225156 Denominators of the sequence of fractions f(n) defined recursively by f(1) = 3/1; f(n+1) is chosen so that the sum and the product of the first n terms of the sequence are equal.
 * @author Georg Fischer
 */
public class A225156 extends Sequence1 {

  private int mN;
  private final int mNum;
  private Q mA;
  private Q mP;

  /** Construct the sequence. */
  public A225156() {
    this(3);
  }

  /**
   * Generic constructor with parameters
   * @param num first numerator
   */
  public A225156(final int num) {
    mN = 0;
    mNum = num;
    mA = Q.ONE;
    mP = Q.ONE;
  }

  /* Maple:
     b:=n->3^(2^(n-2)); # n > 1
     b(1):=3;
     p:=proc(n) option remember; p(n-1)*a(n-1); end;
     p(1):=1;
     a:=proc(n) option remember; b(n)-p(n); end;
     a(1):=1;
     seq(a(i), i=1..9);
   */
  @Override
  public Z next() {
    if (++mN > 1) {
      final Q b = new Q(mNum, 1).pow(1L << mN - 2);
      mP = mA.multiply(mP);
      mA = b.subtract(mP);
    }
    return mA.num();
  }
}
