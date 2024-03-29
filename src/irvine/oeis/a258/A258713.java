package irvine.oeis.a258;
// Generated by gen_seq4.pl 2023-08-18/simtraf at 2023-08-18 21:51

import irvine.math.z.Z;
import irvine.oeis.a001.A001172;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A258713 A001172(n)/2: Least k such that 2k is a sum of two odd primes in exactly n ways.
 * @author Georg Fischer
 */
public class A258713 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A258713() {
    super(0, new A001172(), Z::divide2);
  }
}
