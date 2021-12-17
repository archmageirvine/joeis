package irvine.oeis.a074;
// manually caelem/ca1whites at 2021-12-16 14:58

import irvine.math.z.Z;
import irvine.oeis.ca.Cellular1DAutomaton;

/**
 * A074330 a(n) = Sum_{k=1..n} 2^b(k) where b(k) denotes the number of 1's in the binary representation of k.
 * @author Georg Fischer
 */
public class A074330 extends Cellular1DAutomaton {

  /** Construct the sequence. */
  public A074330() {
    super(153);
    next();
  }

  @Override
  public Z next() {
    return super.nextWhiteSum();
  }
}
