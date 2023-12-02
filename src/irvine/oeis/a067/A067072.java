package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a061.A061912;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A067072 a(n) = smallest square m^2 such that the sum of the digits of m^2 is equal to n^2.
 * @author Georg Fischer
 */
public class A067072 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A067072() {
    super(0, new A061912(), Z::square);
  }
}
