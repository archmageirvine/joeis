package irvine.oeis.a073;

import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005428;

/**
 * A073941 a(n) = ceiling((Sum_{k=1..n-1} a(k)) / 2) for n &gt;= 2 starting with a(1) = 1.
 * @author Sean A. Irvine
 */
public class A073941 extends PrependSequence {

  /** Construct the sequence. */
  public A073941() {
    super(new A005428(), 1);
  }
}
