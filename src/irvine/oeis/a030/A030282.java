package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.ComposeSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a001.A001477;

/**
 * A030282 COMPOSE primes with natural numbers.
 * @author Sean A. Irvine
 */
public class A030282 extends ComposeSequence {

  /** Construct the sequence. */
  public A030282() {
    super(new A001477(), new PrependSequence(new A000040(), Z.ZERO));
    next();
  }
}
