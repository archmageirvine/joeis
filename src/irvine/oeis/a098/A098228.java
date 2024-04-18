package irvine.oeis.a098;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A098228 a(n) = floor(n/(n-phi(n))) = floor(n/cototient(n)).
 * @author Georg Fischer
 */
public class A098228 extends LambdaSequence {

  /** Construct the sequence. */
  public A098228() {
    super(2, n -> Z.valueOf(n / Functions.COTOTIENT.l(n)));
  }
}
