package irvine.oeis.a183;
// Generated by gen_seq4.pl compseq at 2021-08-26 10:17

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a051.A051682;
/**
 * A183223 Complement of the 11-gonal numbers.
 * @author Georg Fischer
 */
public class A183223 extends ComplementSequence {

  /** Construct the sequence. */
  public A183223() {
    super(new A051682(), Z.ONE);
  }
}
