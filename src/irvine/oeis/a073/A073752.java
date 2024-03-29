package irvine.oeis.a073;
// Generated by gen_seq4.pl gcd.rob/tuptraf at 2024-01-26 19:31

import irvine.oeis.a032.A032742;
import irvine.oeis.a052.A052126;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A073752 Greatest common divisor of n/spf(n) and n/gpf(n) where spf(n) is the smallest and gpf(n) is the greatest prime factor of n (see A020639, A006530).
 * @author Georg Fischer
 */
public class A073752 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A073752() {
    super(1, (n, s) -> s[0].gcd(s[1]), "", new A032742(), new A052126());
  }
}
