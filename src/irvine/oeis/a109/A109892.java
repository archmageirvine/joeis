package irvine.oeis.a109;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A109892 a(n) = least integer of the form (n!+1)(n!+2)...(n!+k)/n!.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A109892 extends LambdaSequence {

  /** Construct the sequence. */
  public A109892() {
    super(1, n -> Binomial.binomial(Functions.FACTORIAL.z(n).add(n), Z.valueOf(n)));
  }
}
