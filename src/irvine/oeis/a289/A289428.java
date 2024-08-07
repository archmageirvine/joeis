package irvine.oeis.a289;
// Generated by gen_seq4.pl 2024-08-04/multrar at 2024-08-04 18:23

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A289428 Sum of factorial-Catalan numbers over a certain family of decorations.
 * @author Georg Fischer
 */
public class A289428 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A289428() {
    super(0, (self, n) -> Z.valueOf(n).multiply(self.a(n - 1)).add(Integers.SINGLETON.sum(1, n, k -> self.a(k - 1).multiply(self.a(n - k))).multiply(2)), "1");
  }
}
