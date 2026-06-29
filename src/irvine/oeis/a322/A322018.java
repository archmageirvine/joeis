package irvine.oeis.a322;
// manually 2026-06-29*

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A322018 a(n) = A006068(A129760(A003188(n))).
 * @author Georg Fischer
 */
public class A322018 extends LambdaSequence {

  /** Construct the sequence. */
  public A322018() {
    super(0, n -> {
      final Z gen = Functions.GRAY_ENCODE.z(n);
      return Functions.GRAY_DECODE.z(gen.and(gen.subtract(1)));
    });
  }
}
