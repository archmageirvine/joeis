package irvine.oeis.a134;
// Generated by gen_seq4.pl 2024-12-04.ack/lambdan at 2024-12-04 00:03

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.LambdaSequence;

/**
 * A134912 Ceiling(n*exp(-csc(n))).
 * @author Georg Fischer
 */
public class A134912 extends LambdaSequence {

  /** Construct the sequence. */
  public A134912() {
    super(1, n -> ComputableReals.SINGLETON.csc(CR.valueOf(n)).negate().exp().multiply(n).ceil(1000));
  }
}
