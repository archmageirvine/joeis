package irvine.oeis.a338;

import irvine.math.function.Functions;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A338889 a(n) = L(L(L(n))) mod L(L(n)), where L = Lucas numbers = A000032.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A338889 extends LambdaSequence {

  /** Construct the sequence. */
  public A338889() {
    super(0, n -> {
      final Z lu2 = Functions.LUCAS.z(Functions.LUCAS.z(n));
      return Fibonacci.lucas(lu2, lu2);
    });
  }
}
