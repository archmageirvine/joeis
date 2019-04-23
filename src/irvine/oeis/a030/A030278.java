package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.ComposeSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000040;

/**
 * A030278 COMPOSE primes with primes.
 * @author Sean A. Irvine
 */
public class A030278 extends SkipSequence {

  public A030278() {
    super(new ComposeSequence(new PrependSequence(new A000040(), Z.ZERO)), 1);
  }
}
