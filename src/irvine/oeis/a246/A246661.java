package irvine.oeis.a246;
// Generated by gen_seq4.pl rultraf at 2024-01-19 09:13

import irvine.oeis.a056.A056040;
import irvine.oeis.transform.RunLengthTransformSequence;

/**
 * A246661 Run Length Transform of swinging factorials (A056040).
 * @author Georg Fischer
 */
public class A246661 extends RunLengthTransformSequence {

  /** Construct the sequence. */
  public A246661() {
    super(0, new A056040());
  }
}
