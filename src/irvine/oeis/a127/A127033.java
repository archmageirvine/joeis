package irvine.oeis.a127;
// Generated by gen_seq4.pl 2024-04-17/lambdan at 2024-04-17 19:29

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A127033 Maximal value of m such that 7^m &lt;= n!: a(n) = floor( log(n!) / log(7) ).
 * @author Georg Fischer
 */
public class A127033 extends LambdaSequence {

  /** Construct the sequence. */
  public A127033() {
    super(1, n -> CR.valueOf(Functions.FACTORIAL.z(n)).log().divide(CR.SEVEN.log()).floor());
  }
}
