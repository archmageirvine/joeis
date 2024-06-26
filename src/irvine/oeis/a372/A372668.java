package irvine.oeis.a372;
// Generated by gen_seq4.pl 2024-05-17/lambdan at 2024-05-17 23:03

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A372668 a(n) = (1/phi(n)) * Sum_{j=1..n} Sum_{k=1..n} phi(n*j*k).
 * @author Georg Fischer
 */
public class A372668 extends LambdaSequence {

  /** Construct the sequence. */
  public A372668() {
    super(1, n -> Integers.SINGLETON.sum(1, n, j -> Integers.SINGLETON.sum(1, n, k -> Functions.PHI.z(n * j * k))).divide(Functions.PHI.z(n)));
  }
}
