package irvine.oeis.a095;

import irvine.math.z.Z;
import irvine.oeis.a000.A000041;
import irvine.oeis.transform.InverseEulerTransform;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A095975 -a(n) is inverse EULER transform of -A000041(n).
 *
 * @author Georg Fischer
 */
public class A095975 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A095975() {
    super(1, new SimpleTransformSequence(new A000041(), Z::negate), 1);
    next();
  }

  @Override
  public Z next() {
    return super.next().negate();
  }
}
