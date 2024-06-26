package irvine.oeis.a161;
// Generated by gen_seq4.pl 2024-05-25/multraf at 2024-05-25 23:20

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a001.A001223;
import irvine.oeis.a031.A031131;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A161782 a(n) = sum of all numbers from and including (prime(n+1)-prime(n)) to and including (prime(n+2)-prime(n).).
 * @author Georg Fischer
 */
public class A161782 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A161782() {
    super(1, (self, n) -> Integers.SINGLETON.sum(self.s(0).intValueExact(), self.s(1).intValueExact(), x -> Z.valueOf(x)), "", new A001223(), new A031131());
  }
}
