package irvine.oeis.a143;
// Generated by gen_seq4.pl 2024-04-17/multrar at 2024-04-17 19:29

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A143805 Eigensequence of triangle A130534.
 * @author Georg Fischer
 */
public class A143805 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A143805() {
    super(0, (self, n) -> Integers.SINGLETON.sum(0, n - 1, k -> Z.NEG_ONE.pow(n - k - 1).multiply(Functions.STIRLING1.z(n, k + 1)).multiply(self.a(k))), "1");
  }
}
