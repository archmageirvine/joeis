package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterLambdaSequence;

/**
 * A393096 allocated for Guy Siviour.
 * @author Sean A. Irvine
 */
public class A393096 extends FilterLambdaSequence {

  /** Construct the sequence. */
  public A393096() {
    super(1, k -> {
      final Z sopf = Functions.SOPF.z(k);
      return sopf.isProbablePrime() && k.subtract(sopf).isProbablePrime();
    });
  }
}
