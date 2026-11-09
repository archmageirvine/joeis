package irvine.oeis.a285;

import irvine.oeis.a032.A032742;
import irvine.oeis.a046.A046523;
import irvine.oeis.transform.PairTransformSequence;

/**
 * A285729 a(n) = (1/2)*(2 + ((A032742(n)+A046523(n))^2) - A032742(n) - 3*A046523(n)), where A032742(n) is the largest proper divisor of n, and A046523(n) is the smallest number with same prime signature as n.
 * @author Georg Fischer
 */
public class A285729 extends PairTransformSequence {

  /** Construct the sequence. */
  public A285729() {
    super(1, new A032742(), new A046523());
  }
}
