package irvine.oeis.a147;
// manually 2026-11-06

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a004.A004001;

/**
 * A147981 a(n) = A147952(A004001(n)).
 * @author Georg Fischer
 */
public class A147981 extends LambdaSequence {

  private static final DirectSequence A004001 = new A004001();
  private static final DirectSequence A147952 = new A147952();

  /** Construct the sequence. */
  public A147981() {
    super(0, n -> A147952.a(A004001.a(n)));
  }
}
