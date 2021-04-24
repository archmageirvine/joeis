package irvine.oeis.a160;
// manually

import irvine.math.z.Z;

/**
 * A160890 a(n) = ((2^b-1)/phi(n))*Sum_{d|n} Moebius(n/d)*d^(b-1) for b = 3.
 * a(n) = J_3(n)/J_1(n)=J_3(n)/phi(n)=A059376(n)/A000010(n)
 * @author Georg Fischer
 */
public class A160890 extends A160889 {

  protected long mN = 0;

  /** Construct the sequence. */
  public A160890() {
    this(3);
  }

  /**
   * Generic constructor with parameter
   * @param b exponent of Jordan function + 1
   */
  protected A160890(final int b) {
    super(b);
  }

  @Override
  public Z next() {
    ++mN;
    return super.next().multiply(Z.ONE.shiftLeft(mExp + 1).subtract(1));
  }
}
