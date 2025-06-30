package irvine.oeis.a063;

import irvine.oeis.InterleaveSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a024.A024675;

/**
 * A063934 Numbers which are either prime or the average of consecutive odd primes.
 * @author Sean A. Irvine
 */
public class A063934 extends InterleaveSequence {

  /** Construct the sequence. */
  public A063934() {
    super(1, new PrependSequence(new A024675(), 2), new A000040().skip(1));
  }
}
