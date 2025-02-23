package irvine.oeis.a345;
// Generated by gen_seq4.pl 2024-12-14.ack/multrar at 2024-12-14 16:31

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A345233 G.f. A(x) satisfies: A(x) = x + x^2 / exp(A(x) - A(x^2)/2 + A(x^3)/3 - A(x^4)/4 + ...).
 * @author Georg Fischer
 */
public class A345233 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A345233() {
    super(1, (self, n) -> Integers.SINGLETON.sum(1, n - 2, k -> Integers.SINGLETON.sumdiv(k, d -> Z.NEG_ONE.pow(k / d).multiply(d).multiply(self.a(d))).multiply(self.a(n - k))).divide(n - 2), "1,1");
  }
}
