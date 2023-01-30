package irvine.oeis.a061;

import irvine.math.z.ZUtils;
import irvine.oeis.FilterSequence;
import irvine.oeis.a028.A028864;

/**
 * A061244 Prime numbers with odd digits in ascending order.
 * @author Sean A. Irvine
 */
public class A061244 extends FilterSequence {

  /** Construct the sequence. */
  public A061244() {
    super(new A028864(), k -> (ZUtils.syn(k) & 0b101010101) == 0);
  }
}
