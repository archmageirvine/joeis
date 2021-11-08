package irvine.oeis.a095;

import irvine.math.z.Z;
import irvine.oeis.InverseEulerTransform;
import irvine.oeis.NegationTransformSequence;
import irvine.oeis.a000.A000041;

/**
 * A095975 -a(n) is inverse EULER transform of -A000041(n).
 *
 * @author Georg Fischer
 */
public class A095975 extends InverseEulerTransform {

  /**
   * Construct the sequence.
   */
  public A095975() {
    super(new NegationTransformSequence(new A000041()), 1);
    next();
  }

  @Override
  public Z next() {
    return super.next().negate();
  }
}
