package irvine.oeis.a309;
// Generated by gen_seq4.pl gcd.rob/tuptraf at 2024-01-26 19:31

import irvine.oeis.a007.A007504;
import irvine.oeis.a014.A014285;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A309036 a(n) = gcd(A007504(n), A014285(n)).
 * @author Georg Fischer
 */
public class A309036 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A309036() {
    super(1, (n, s) -> s[0].gcd(s[1]), "", new A007504().skip(1), new A014285());
  }
}
