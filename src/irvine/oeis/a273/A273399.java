package irvine.oeis.a273;

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A273399 a(n) = Catalan(Catalan(n)).
 * @author Georg Fischer
 */
public class A273399 extends LambdaSequence {

  /** Construct the sequence. */
  public A273399() {
    super(0, n -> Functions.CATALAN.z(Functions.CATALAN.z(n)));
  }
}
