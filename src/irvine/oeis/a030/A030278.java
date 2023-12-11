package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.transform.ComposeTransformSequence;

/**
 * A030278 COMPOSE primes with primes.
 * @author Sean A. Irvine
 */
public class A030278 extends ComposeTransformSequence {

  /** Construct the sequence. */
  public A030278() {
    super(1, new PrependSequence(new A000040(), Z.ZERO));
    skip();
  }
}
