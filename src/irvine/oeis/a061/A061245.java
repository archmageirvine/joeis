package irvine.oeis.a061;

import irvine.math.z.ZUtils;
import irvine.oeis.FilterSequence;
import irvine.oeis.a028.A028867;

/**
 * A061245 Prime numbers with odd digits in descending order.
 * @author Sean A. Irvine
 */
public class A061245 extends FilterSequence {

  /** Construct the sequence. */
  public A061245() {
    super(new A028867(), k -> (ZUtils.syn(k) & 0b101010101) == 0);
  }
}
