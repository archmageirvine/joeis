package irvine.oeis.a294;
// manually deris2/recordval at 2021-11-04

import irvine.oeis.RecordSequence;
import irvine.oeis.a007.A007963;
/**
 * A294358 Number of ways to write A294357(n) as a sum of 3 odd primes p+q+r, with p&gt;=q&gt;=r.
 * @author Georg Fischer
 */
public class A294358 extends RecordSequence {

  /** Construct the sequence. */
  public A294358() {
    super(new A007963(), false);
    next();
  }
}
