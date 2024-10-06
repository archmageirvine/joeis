package irvine.oeis.a072;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.a033.A033676;

/**
 * A072488 a(1) = 1, a(n) = a(n-1) times largest divisor of n &lt;= n^(1/2).
 * @author Sean A. Irvine
 */
public class A072488 extends PartialProductSequence {

  /** Construct the sequence. */
  public A072488() {
    super(1, new A033676());
  }
}

