package irvine.oeis.a063;

import irvine.oeis.AlternatingSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a024.A024675;

/**
 * A063934 Numbers which are either prime or the average of consecutive odd primes.
 * @author Sean A. Irvine
 */
public class A063934 extends AlternatingSequence {

  /** Construct the sequence. */
  public A063934() {
    super(new PrependSequence(new A024675(), 2), new SkipSequence(new A000040(), 1));
  }
}
