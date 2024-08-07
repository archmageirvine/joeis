package irvine.oeis.a260;
// Generated by gen_seq4.pl 2024-07-02/multrar at 2024-07-03 22:28

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A260725 a(1)=a(2)=a(3)=a(4)=a(5)=2; thereafter, a(n) = gpf(1 + Product_{k=1..5} a(n-k)), where gpf is greatest prime factor.
 * @author Georg Fischer
 */
public class A260725 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A260725() {
    super(1, (self, n) -> Functions.GPF.z(Z.ONE.add(Integers.SINGLETON.product(1, 5, k -> self.a(n - k)))), "2, 2, 2, 2, 2");
  }
}
