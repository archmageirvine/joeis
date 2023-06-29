package irvine.oeis.a034;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;

/**
 * A034864 a(5) = 5, a(6) = 1170, for n &gt;= 7, a(n) = n!*(4*n^3 - 30*n^2 + 40*n + 3)/24.
 * @author Sean A. Irvine
 */
public class A034864 extends PrependSequence {

  /** Construct the sequence. */
  public A034864() {
    super(5, new SkipSequence(new A034863(), 3), 5, 1170);
  }
}
