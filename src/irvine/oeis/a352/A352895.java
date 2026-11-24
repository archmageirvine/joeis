package irvine.oeis.a352;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A352895 The maximum binary weight of those elements of the Collatz orbit of n that follow after the term n itself, when iterated down to 1, or -1 if 1 is never reached.
 * @author Gregory Morse
 */
public class A352895 extends LambdaSequence {
  /** Construct the sequence. */
  public A352895() {
    super(1, n -> {
      int max = 1;
      for (Z t = Z.valueOf(n); !t.isOne();) {
        t = Functions.COLLATZ.z(t).makeOdd();
        max = Math.max(max, t.bitCount());
      }
      return Z.valueOf(max);
    });
  }
}
