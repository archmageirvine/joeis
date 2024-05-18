package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A069902 Largest prime factor of n(n+1)/2, the n-th triangular number.
 * @author Georg Fischer
 */
public class A069902 extends LambdaSequence {

  /** Construct the sequence. */
  public A069902() {
    super(1, n -> Functions.GPF.z(Z.valueOf(n).multiply(n + 1).divide2()));
  }
}
