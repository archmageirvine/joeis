package irvine.oeis.a265;
// Generated by gen_seq4.pl 2024-07-02/lambdan at 2024-07-03 22:28

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a263.A263273;

/**
 * A265340 Number of iterations of A265339 needed to reach zero; a(0) = 0; for n &gt;= 1, a(n) = 1 + a(A265339(n)).
 * @author Georg Fischer
 */
public class A265340 extends LambdaSequence {

  private static final DirectSequence A263273 = new A263273();

  /** Construct the sequence. */
  public A265340() {
    super(0, n -> Functions.DIGIT_LENGTH.z(2, A263273.a(n)));
  }
}
