package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A072695.
 * @author Sean A. Irvine
 */
public class A072696 extends LambdaSequence {

  /** Construct the sequence. */
  public A072696() {
    super(1, n -> Functions.SIGMA0.z(Z.valueOf(n).pow(3)).lcm(Functions.SIGMA0.z(n)));
  }
}
