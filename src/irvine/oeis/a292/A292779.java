package irvine.oeis.a292;
// Generated by gen_seq4.pl manch4/tuptraf at 2024-03-12 13:36

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A292779 Interpret the values of the Moebius function mu(k) for k = n to 1 as a balanced ternary number.
 * @author Georg Fischer
 */
public class A292779 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A292779() {
    super(1, (n, s) -> s[0].add(Z.THREE.pow(n - 1).multiply(Functions.MOBIUS.i(n))), "1", PREVIOUS);
  }
}
