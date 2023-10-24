package irvine.oeis.a286;

import irvine.math.z.Z;
import irvine.oeis.a032.A032742;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A286474 Compound filter: a(n) = 4*A032742(n) + (n mod 4), a(1) = 1.
 * @author Georg Fischer
 */
public class A286474 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A286474() {
    super(1, new A032742(), (n, v) -> (n == 1) ? Z.ONE : v.multiply(4).add(n % 4));
  }
}
