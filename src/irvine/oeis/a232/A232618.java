package irvine.oeis.a232;
// Generated by gen_seq4.pl 2024-01-20/lambdan at 2024-01-21 23:32

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A232618 a(n) = (2n)!! mod (2n-1)!! where k!! = A006882(k).
 * @author Georg Fischer
 */
public class A232618 extends LambdaSequence {

  /** Construct the sequence. */
  public A232618() {
    super(1, n -> Functions.MULTIFACTORIAL.z(2 * n).mod(Functions.MULTIFACTORIAL.z(2 * n - 1)));
  }
}
