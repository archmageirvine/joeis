package irvine.oeis.a361;
// Generated by gen_seq4.pl 2024-04-09/tuptraf at 2024-04-09 23:00

import irvine.math.function.Functions;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A361520 a(n) is the greatest prime factor of a(n-2)^2 + a(n-1)^2 where a(1)=2 and a(2)=3.
 * @author Georg Fischer
 */
public class A361520 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A361520() {
    super(1, (n, s) -> Functions.GPF.z(s[0].square().add(s[1].square())), "2, 3", PREVIOUS, PREVIOUS);
  }
}
