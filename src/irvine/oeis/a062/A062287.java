package irvine.oeis.a062;

import irvine.math.z.ZUtils;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002113;

/**
 * A062287 Palindromic numbers with even digits.
 * @author Sean A. Irvine
 */
public class A062287 extends FilterSequence {

  /** Construct the sequence. */
  public A062287() {
    super(new A002113(), k -> (ZUtils.syn(k) & 0b1010101010) == 0);
  }
}

