package irvine.oeis.a248;
// Generated by gen_seq4.pl 2024-06-19/lambdan at 2024-06-19 23:57

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a294.A294491;

/**
 * A248828 Number of 2n-length words, either empty or beginning with the first character of an n-ary alphabet, that can be built by repeatedly inserting doublets into the initially empty word.
 * @author Georg Fischer
 */
public class A248828 extends LambdaSequence {

  private static final DirectSequence A294491 = new A294491();

  /** Construct the sequence. */
  public A248828() {
    super(0, n -> (n == 0) ? Z.ONE : A294491.a(n).divide(n));
  }
}
