package irvine.oeis.a395;

import irvine.oeis.Combiner;
import irvine.oeis.a033.A033677;
import irvine.oeis.a135.A135034;

/**
 * A395409 a(n) = A033677(n) - A135034(n); excess of the smallest divisor of n &gt;= sqrt(n) over ceiling(sqrt(n)).
 * @author Sean A. Irvine
 */
public class A395409 extends Combiner {

  /** Construct the sequence. */
  public A395409() {
    super(1, new A033677(), new A135034().skip(), SUBTRACT);
  }
}
