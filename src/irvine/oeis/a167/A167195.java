package irvine.oeis.a167;
// Generated by gen_seq4.pl 2023-12-03/tuptraf at 2023-12-03 21:34

import irvine.math.z.Z;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A167195 a(2)=3, for n&gt;=3, a(n)=a(n-1)+gcd(n, a(n-1)).
 * @author Georg Fischer
 */
public class A167195 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A167195() {
    super(2, (n, s) -> s[0].add(Z.valueOf(n).gcd(s[0])), "3", PREVIOUS);
  }
}
