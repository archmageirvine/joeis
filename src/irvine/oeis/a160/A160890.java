package irvine.oeis.a160;
// manually

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a059.A059376;

/**
 * A160890 a(n) = ((2^b-1)/phi(n))*Sum_{d|n} Moebius(n/d)*d^(b-1) for b = 3.
 * a(n) = J_2(n)/J_1(n)
 * @author Georg Fischer
 */
public class A160890 extends A059376 {

  protected long mN = 0;
  protected long mB21; // 2^b-1

  /** Construct the sequence. */
  public A160890() {
    this(3);
  }

  /**
   * Generic constructor with parameter 
   * @param b exponent of Jordan function + 1
   */
  public A160890(final int b) {
    super(b - 1);
    mB21 = (1 << b) - 1;
  }
  
  
  @Override
  public Z next() {
    ++mN;
    return super.next().multiply(mB21).divide(LongUtils.phi(mN));
  }
}
