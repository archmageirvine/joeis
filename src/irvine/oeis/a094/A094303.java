package irvine.oeis.a094;

import irvine.oeis.PrependSequence;
import irvine.oeis.a064.A064847;

/**
 * A094303 a(1) = 1, a(2) = 2, and a(n+1) = a(n) * sum of all previous terms up to a(n-1) for n &gt;= 2.
 * @author Georg Fischer
 */
public class A094303 extends PrependSequence {

  /** Construct the sequence. */
  public A094303() {
    super(1, new A064847().skip(2), 1, 2);
  }
}
