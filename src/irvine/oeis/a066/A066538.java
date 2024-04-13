package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000668;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A066538 Sum of the digits of the n-th Mersenne prime (A000668).
 * @author Sean A. Irvine
 */
public class A066538 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A066538() {
    super(1, new A000668(), k -> Functions.DIGIT_SUM.z(k));
  }
}
