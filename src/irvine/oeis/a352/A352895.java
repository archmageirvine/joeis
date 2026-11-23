package irvine.oeis.a352;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A352895 Maximum binary weight reached after the first step of the Collatz trajectory down to 1.
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
