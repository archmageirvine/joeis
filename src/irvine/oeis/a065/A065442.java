package irvine.oeis.a065;

import irvine.oeis.a073.A073668;

/**
 * A065442 Decimal expansion of Erd\u0151s-Borwein constant Sum_{k&gt;=1} 1/(2^k - 1).
 * @author Sean A. Irvine
 */
public class A065442 extends A073668 {

  /** Construct the sequence. */
  public A065442() {
    super(2);
    setOffset(1);
  }
}
