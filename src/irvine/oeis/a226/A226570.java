package irvine.oeis.a226;
// manually 2026-06-29*

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A226570 a(n) = Sum_{k=1..n} (k+1)! mod n.
 * @author Georg Fischer
 */
public class A226570 extends LambdaSequence {

  /** Construct the sequence. */
  public A226570() {
    super(1, n -> Integers.SINGLETON.sum(2, n, m -> Functions.FACTORIAL.z(m).mod(Z.valueOf(n))).modZ(n));
  }
}
