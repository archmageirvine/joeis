package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a000.A000607;

/**
 * A064153 Values of n that are not solution of pr(x)=n where pr(x) is the prime partition function of x.
 * @author Sean A. Irvine
 */
public class A064153 extends ComplementSequence {

  /** Construct the sequence. */
  public A064153() {
    super(new A000607().skip(2), Z.ONE);
  }
}
