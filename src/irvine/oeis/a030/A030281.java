package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.ComposeSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a001.A001477;

/**
 * A030281 COMPOSE natural numbers with primes.
 * @author Sean A. Irvine
 */
public class A030281 extends ComposeSequence {

  /** Construct the sequence. */
  public A030281() {
    super(new PrependSequence(new A000040(), Z.ZERO), new A001477());
    next();
  }
}
