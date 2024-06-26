package irvine.oeis.a066;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A066084 a(n) = (n!)^2 + n! + n.
 * a(n)=(n!)^2+n!+n
 * @author Georg Fischer
 */
public class A066084 extends LambdaSequence {

  /** Construct the sequence. */
  public A066084() {
    super(0, n -> Functions.FACTORIAL.z(n).square().add(Functions.FACTORIAL.z(n)).add(n));
  }
}
