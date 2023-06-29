package irvine.oeis.a072;

import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005427;

/**
 * A072493 a(1) = 1 and a(n) = ceiling((Sum_{k=1..n-1} a(k))/3) for n &gt;= 2.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A072493 extends PrependSequence {

  /** Construct the sequence. */
  public A072493() {
    super(1, new A005427(), 1, 1, 1, 1, 2, 2, 3, 4);
  }
}
