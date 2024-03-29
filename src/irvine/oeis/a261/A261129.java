package irvine.oeis.a261;
// Generated by gen_seq4.pl dirtraf at 2024-02-06 22:08

import irvine.oeis.a051.A051903;
import irvine.oeis.a056.A056040;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A261129 Highest exponent in prime factorization of the swinging factorial (A056040).
 * @author Georg Fischer
 */
public class A261129 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A261129() {
    super(2, new A051903(), new A056040());
  }
}
