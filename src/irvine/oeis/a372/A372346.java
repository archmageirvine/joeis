package irvine.oeis.a372;
// manually 2026-06-30

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A372346 a(n) = Sum_{j=0..n} p(n - j, j) where p(n, x) = Sum_{k=0..n} k! * Stirling2(n, k) * x^k. Row sums of A344499.
 * @author Georg Fischer
 */
public class A372346 extends LambdaSequence {

  /** Construct the sequence. */
  public A372346() {
    super(0, n -> Integers.SINGLETON.sum(0, n, j -> Integers.SINGLETON.sum(0, n - j, k ->
      Functions.FACTORIAL.z(k).multiply(Functions.STIRLING2.z(n - j, k)).multiply(Z.valueOf(j).pow(k)))));
  }
}
