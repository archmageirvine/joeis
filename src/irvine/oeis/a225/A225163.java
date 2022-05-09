package irvine.oeis.a225;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A225163 Denominators of the sequence s(n) of the sum resp. product of fractions f(n) defined recursively by f(1) = 3/1; f(n+1) is chosen so that the sum and the product of the first n terms of the sequence are equal.
 * @author Georg Fischer
 */
public class A225163 implements Sequence {

  private int mN;
  private int mNum;
  private Q mB;

  /** Construct the sequence. */
  public A225163() {
    this(3);
  }

  /**
   * Generic constructor with parameters
   * @param num first numerator
   */
  public A225163(final int num) {
    mN = 0;
    mNum = num;
    mB = new Q(1, mNum);
  }

  /* Maple:
    b:=proc(n) option remember; b(n-1)-b(n-1)^2; end:
    b(1):=1/3;
    a:=n->3^(2^(n-1))*b(n);
    seq(a(i), i=1..9);
  */
  @Override
  public Z next() {
    ++mN;
    final Q result = new Q(mNum, 1).pow(1 << (mN - 1)).multiply(mB);
    mB = mB.subtract(mB.multiply(mB));
    return result.num();
  }
}
