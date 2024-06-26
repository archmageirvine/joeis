package irvine.oeis.a359;
// Generated by gen_seq4.pl 2024-05-24/filnum at 2024-05-24 21:50

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.FilterNumberSequence;
import irvine.oeis.a023.A023900;

/**
 * A359875 Numbers k such that A002322(k) = A023900(k).
 * @author Georg Fischer
 */
public class A359875 extends FilterNumberSequence {

  private static final DirectSequence A023900 = new A023900();

  /** Construct the sequence. */
  public A359875() {
    super(1, 1, k -> Functions.CARMICHAEL_LAMBDA.z(k).equals(A023900.a(k)));
  }
}
