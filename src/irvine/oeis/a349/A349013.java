package irvine.oeis.a349;
// Generated by gen_seq4.pl 2024-05-11/multrar at 2024-05-11 21:20

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A349013 G.f. A(x) satisfies: A(x) = (1 + x * A(2*x)) / (1 - x^2 * A(x)).
 * @author Georg Fischer
 */
public class A349013 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A349013() {
    super(0, (self, n) -> Z.TWO.pow(n - 1).multiply(self.a(n - 1)).add(Integers.SINGLETON.sum(0, n - 2, k -> self.a(k).multiply(self.a(n - k - 2)))), "1");
  }
}
