package irvine.oeis.a363;
// Generated by gen_seq4.pl 2024-04-11/tuptraf at 2024-04-11 21:12

import irvine.math.z.Z;
import irvine.oeis.a001.A001222;
import irvine.oeis.a007.A007947;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A363923 a(n) = n^npf(n) / rad(n), where npf(n) is the number of prime factors with multiplicity of n.
 * @author Georg Fischer
 */
public class A363923 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A363923() {
    super(1, (n, s) -> Z.valueOf(n).pow(s[0]).divide(s[1]), "", new A001222(), new A007947());
  }
}
