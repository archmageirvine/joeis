package irvine.oeis.a111;

import irvine.math.z.Z;
import irvine.oeis.a059.A059372;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A111111 Number of simple permutations of degree n.
 * @author Georg Fischer
 */
public class A111111 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A111111() {
    super(0, (self, n) -> self.s(0).negate().add(Z.NEG_ONE.pow(n + 1).multiply(2)), "1, 1, 2", new A059372());
  }
}
