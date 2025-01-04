package irvine.oeis.a307;
// manually 2025-01-01/binomtraf at 2025-01-01 19:32

import irvine.math.z.Z;
import irvine.oeis.a003.A003418;
import irvine.oeis.transform.BinomialTransform;

/**
 * A307803 Inverse binomial transform of least common multiple sequence.
 * @author Georg Fischer
 */
public class A307803 extends BinomialTransform {

  private int mN = -1;

  /** Construct the sequence. */
  public A307803() {
    super(0, new A003418(), 1, true);
  }

  @Override
  public Z next() {
    return (++mN == 1) ? super.next().abs().negate() : super.next().abs();
  }
}
