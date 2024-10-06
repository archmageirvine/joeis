package irvine.oeis.a072;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.a033.A033677;

/**
 * A072489 a(1) = 1, a(n) = a(n-1) times smallest divisor of n &gt;= n^(1/2).
 * @author Sean A. Irvine
 */
public class A072489 extends PartialProductSequence {

  /** Construct the sequence. */
  public A072489() {
    super(1, new A033677());
  }
}

