package irvine.oeis.a122;
// Generated by gen_seq4.pl compseq at 2021-08-26 10:17

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a002.A002410;
/**
 * A122526 Complement of A002410.
 * @author Georg Fischer
 */
public class A122526 extends ComplementSequence {

  /** Construct the sequence. */
  public A122526() {
    super(new A002410(), Z.ONE);
  }
}
