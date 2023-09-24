package irvine.oeis.a065;

import irvine.oeis.PrependSequence;
import irvine.oeis.a061.A061359;

/**
 * A065691 a(1) = 0; for n &gt; 1, a(n) is the smallest integer &gt; 0 such that the concatenation a(n)a(n-1)...a(2)a(1) is a square.
 * @author Sean A. Irvine
 */
public class A065691 extends PrependSequence {

  /** Construct the sequence. */
  public A065691() {
    super(1, new A061359().skip(), 0, 10);
  }
}
