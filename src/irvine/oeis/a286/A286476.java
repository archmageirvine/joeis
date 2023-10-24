package irvine.oeis.a286;

import irvine.math.z.Z;
import irvine.oeis.a032.A032742;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A286476 Compound filter: a(n) = 6*A032742(n) + (n mod 6), a(1) = 1.
 * @author Georg Fischer
 */
public class A286476 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A286476() {
    super(1, new A032742(), (n, v) -> (n == 1) ? Z.ONE : v.multiply(6).add(n % 6));
  }
}
