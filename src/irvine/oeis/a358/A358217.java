package irvine.oeis.a358;
// Generated by gen_seq4.pl known/simtraf at 2023-11-06 12:44

import irvine.math.function.Functions;
import irvine.oeis.a319.A319627;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A358217 Number of prime factors (with multiplicity) in A319627(n).
 * @author Georg Fischer
 */
public class A358217 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A358217() {
    super(1, new A319627(), v -> Functions.BIG_OMEGA.z(v));
  }
}
