package irvine.oeis.a176;
// Generated by gen_seq4.pl 2024-05-14/multrar at 2024-05-14 21:53

import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A176337 a(n) = 1 + (1-2^n)*a(n-1) for n &gt; 0, a(0)=0.
 * @author Georg Fischer
 */
public class A176337 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A176337() {
    super(0, (self, n) -> self.a(n - 1).multiply(Z.ONE.subtract(Z.TWO.pow(n))).add(1), "0");
  }
}
