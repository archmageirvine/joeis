package irvine.oeis.a324;
// Generated by gen_seq4.pl 2024-05-25/simtraf at 2024-05-25 23:20

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a001.A001227;
import irvine.oeis.a156.A156552;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A324117 Number of odd divisors in A156552(n): a(1) = 0, for n &gt; 1, a(n) = A001227(A156552(n)) = A000005(A322993(n)).
 * @author Georg Fischer
 */
public class A324117 extends SimpleTransformSequence {

  private static final DirectSequence A001227 = new A001227();

  /** Construct the sequence. */
  public A324117() {
    super(1, new A156552(), (n, v) -> n == 1 ? Z.ZERO : A001227.a(v));
  }
}
