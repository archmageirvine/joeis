package irvine.oeis.a247;
// Generated by gen_seq4.pl 2023-12-03/tuptraf at 2023-12-07 21:51

import irvine.math.z.Z;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A247378 a(n) = (a(n-1) * a(n-3) - (-1)^n * a(n-2)^2) / a(n-4) with a(1) = a(3) = a(4) = 1, a(2) = -2.
 * @author Georg Fischer
 */
public class A247378 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A247378() {
    super(1, (n, s) -> s[0].multiply(s[2]).subtract(Z.NEG_ONE.pow(n).multiply(s[1].square())).divide(s[3]), "1,-2, 1, 1", PREVIOUS, PREVIOUS, PREVIOUS, PREVIOUS);
  }
}
