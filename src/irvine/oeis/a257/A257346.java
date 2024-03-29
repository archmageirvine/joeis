package irvine.oeis.a257;
// Generated by gen_seq4.pl complem at 2023-09-11 12:58

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a028.A028951;

/**
 * A257346 Numbers not of the form x^2+xy+2y^2.
 * @author Georg Fischer
 */
public class A257346 extends ComplementSequence {

  /** Construct the sequence. */
  public A257346() {
    super(1, new A028951(), Z.ONE);
  }
}
