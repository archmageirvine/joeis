package irvine.oeis.a332;
// Generated by gen_seq4.pl 2025-05-29.ack/multia at 2025-05-29 22:38

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A332682 a(n) = Sum_{k=1..n} (-1)^(k+1) * ceiling(n/k).
 * @author Georg Fischer
 */
public class A332682 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A332682() {
    super(1, (self, n) -> Integers.SINGLETON.sum(1, n, k -> Z.NEG_ONE.pow(k + 1).multiply(n % k == 0 ? n / k : n / k + 1)), "");
  }
}
