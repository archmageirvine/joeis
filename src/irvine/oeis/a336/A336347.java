package irvine.oeis.a336;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A336347 Least prime factor of 44745755^4*2^(4n+2) + 1.
 * @author Georg Fischer
 */
public class A336347 extends LambdaSequence {

  private static final Z C = Z.valueOf(44745755).pow(4);

  /** Construct the sequence. */
  public A336347() {
    super(0, n -> Functions.LPF.z(C.multiply(Z.TWO.pow(4L * n + 2)).add(1)));
  }
}
