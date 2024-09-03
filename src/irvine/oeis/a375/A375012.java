package irvine.oeis.a375;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A375012 A cycle of length 5 when iterating x &lt;- phi(sigma(x)).
 * @author Georg Fischer
 */
public class A375012 extends AbstractSequence {

  private Z mA; // current term

  /** Construct the sequence. */
  public A375012() {
    this(1, "339026688000000");
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param start first (lowest) term of the cycle
   */
  public A375012(final int offset, final String start) {
    super(offset);
    // lowest term of the cycle
    mA = new Z(start);
  }

  @Override
  public Z next() {
    final Z result = mA;
    mA = Functions.PHI.z(Functions.SIGMA1.z(mA));
    return result;
  }
}
