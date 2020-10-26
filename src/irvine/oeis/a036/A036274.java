package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;

/**
 * A036274 Absolute values of differences of A036273.
 * @author Sean A. Irvine
 */
public class A036274 extends DifferenceSequence {

  /** Construct the sequence. */
  public A036274() {
    super(new A036273());
  }

  @Override
  public Z next() {
    return super.next().abs();
  }
}

