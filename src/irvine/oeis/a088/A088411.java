package irvine.oeis.a088;
// Generated by gen_seq4.pl robots/union2 at 2023-08-23 09:55

import irvine.oeis.UnionSequence;
import irvine.oeis.a014.A014545;
import irvine.oeis.a057.A057704;

/**
 * A088411 A088257 indexed by A002110.
 * @author Georg Fischer
 */
public class A088411 extends UnionSequence {

  /** Construct the sequence. */
  public A088411() {
    super(1, new A057704(), new A014545());
  }
}
