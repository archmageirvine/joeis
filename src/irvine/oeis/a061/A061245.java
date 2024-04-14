package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a028.A028867;

/**
 * A061245 Prime numbers with odd digits in descending order.
 * @author Sean A. Irvine
 */
public class A061245 extends FilterSequence {

  /** Construct the sequence. */
  public A061245() {
    super(new A028867(), k -> (Functions.SYNDROME.i(k) & 0b101010101) == 0);
  }
}
