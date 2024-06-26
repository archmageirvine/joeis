package irvine.oeis.a113;
// Generated by gen_seq4.pl knowna4/simtraf at 2023-09-26 15:09

import irvine.math.function.Functions;
import irvine.oeis.a000.A000073;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A113842 a(n) = Prime(tribonacci(n)).
 * @author Georg Fischer
 */
public class A113842 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A113842() {
    super(2, new A000073(), v -> Functions.PRIME.z(v));
    super.next();
    super.next();
  }
}
