package irvine.oeis.a046;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000040;

/**
 * A046022 Primes together with 1 and 4.
 * @author Sean A. Irvine
 */
public class A046022 extends PrependSequence {

  /** Construct the sequence. */
  public A046022() {
    super(new SkipSequence(new A000040(), 2), 1, 2, 3, 4);
  }
}
