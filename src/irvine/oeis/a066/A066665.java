package irvine.oeis.a066;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a035.A035250;

/**
 * A066665 a(n) = #{(x,y) | 0&lt;=y&lt;=x&lt;=n and x+y is prime}.
 * @author Sean A. Irvine
 */
public class A066665 extends PartialSumSequence {

  /** Construct the sequence. */
  public A066665() {
    super(new A035250());
  }
}
