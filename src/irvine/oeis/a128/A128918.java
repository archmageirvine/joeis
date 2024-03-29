package irvine.oeis.a128;
// Generated by gen_seq4.pl caelem/ca1blacks at 2021-12-16 21:00

import irvine.math.z.Z;
import irvine.oeis.ca.Cellular1DAutomaton;

/**
 * A128918 a(n) = n*(n+1)/2 if n is odd, otherwise (n-1)*n/2 + 1.
 * @author Georg Fischer
 */
public class A128918 extends Cellular1DAutomaton {

  /** Construct the sequence. */
  public A128918() {
    super(1);
  }

  @Override
  public Z next() {
    return super.nextBlackSum();
  }
}
