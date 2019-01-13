package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.a000.A000312;

/**
 * A007781.
 * @author Sean A. Irvine
 */
public class A007781 extends DifferenceSequence {

  /** Construct the sequence. */
  public A007781() {
    super(new A000312());
  }

  @Override
  public Z next() {
    return super.next().max(Z.ONE);
  }
}
