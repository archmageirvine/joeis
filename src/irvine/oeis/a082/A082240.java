package irvine.oeis.a082;
// Generated by gen_seq4.pl finifull at 2020-01-25 12:34

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A082240 Break up the cyclic concatenation 1234567890123456789023... into parts nontrivially (a(n) is not equal to n) such that the n-th part is a multiple of n.
 * @author Georg Fischer
 */
public class A082240 extends FiniteSequence {

  /** Construct the sequence. */
  public A082240() {
    super(1, FINITE, new Z("12"), new Z("34"), new Z("567"), Z.EIGHT, new Z("90"), new Z("12"), new Z("34567890"), new Z("123456"), new Z("789012"), new Z("34567890"), new Z("123456789012345678901"));
  }
}
