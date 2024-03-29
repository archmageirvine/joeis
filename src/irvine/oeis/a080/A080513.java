package irvine.oeis.a080;
// Generated by gen_seq4.pl caelem/ca1blackn at 2021-12-16 21:00

import irvine.math.z.Z;
import irvine.oeis.ca.Cellular1DAutomaton;

/**
 * A080513 a(n) = round(n/2) + 1 = ceiling(n/2) + 1 = floor((n+1)/2) + 1.
 * @author Georg Fischer
 */
public class A080513 extends Cellular1DAutomaton {

  /** Construct the sequence. */
  public A080513() {
    super(28);
  }

  @Override
  public Z next() {
    return super.nextBlackCount();
  }
}
