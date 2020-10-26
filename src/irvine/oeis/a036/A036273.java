package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;

/**
 * A036273 Absolute values of differences of A036272.
 * @author Sean A. Irvine
 */
public class A036273 extends DifferenceSequence {

  /** Construct the sequence. */
  public A036273() {
    super(new A036272());
  }

  @Override
  public Z next() {
    return super.next().abs();
  }
}

