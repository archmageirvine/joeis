package irvine.oeis.a228;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A228613 Least prime factor of (2n+1)^(2n+1)+2.
 * @author Georg Fischer
 */
public class A228613 extends LambdaSequence {

  /** Construct the sequence. */
  public A228613() {
    super(0, n -> Functions.LPF.z(Z.valueOf(2L * n + 1).pow(2L * n + 1).add(2)));
  }
}
