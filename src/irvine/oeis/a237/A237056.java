package irvine.oeis.a237;
// Generated by gen_seq4.pl interleave at 2021-11-02 22:34

import irvine.oeis.InterleaveSequence;
import irvine.oeis.a003.A003309;
import irvine.oeis.a192.A192607;

/**
 * A237056 Ludic and non-ludic numbers interleaved.
 * @author Georg Fischer
 */
public class A237056 extends InterleaveSequence {

  /** Construct the sequence. */
  public A237056() {
    super(new A003309(), new A192607());
  }
}
