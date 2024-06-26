package irvine.oeis.a084;
// Generated by gen_seq4.pl 2024-06-02/lambdan at 2024-06-02 23:31

import irvine.math.cr.CR;
import irvine.oeis.LambdaSequence;

/**
 * A084062 Main diagonal of number array A084061.
 * @author Georg Fischer
 */
public class A084062 extends LambdaSequence {

  /** Construct the sequence. */
  public A084062() {
    super(0, n -> CR.valueOf(n).add(CR.valueOf(n).sqrt()).pow(n).add(CR.valueOf(n).subtract(CR.valueOf(n).sqrt()).pow(n)).divide(2).floor());
  }
}
