package irvine.oeis.a089;
// Generated by gen_seq4.pl 2024-04-11/tuptraf at 2024-04-11 21:12

import irvine.math.z.Z;
import irvine.oeis.a085.A085745;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A089535 Semiprimes of the form 2^k + k.
 * @author Georg Fischer
 */
public class A089535 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A089535() {
    super(1, (n, s) -> Z.TWO.pow(s[0]).add(s[1]), "", new A085745(), new A085745());
  }
}
