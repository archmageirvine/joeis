package irvine.oeis.a068;

import irvine.factor.prime.Puma;
import irvine.oeis.a051.A051342;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A068488 m for which p(m) is the least prime dividing #p(n) + 1, i.e., primorial n-th prime augmented by 1 (A005234).
 * @author Sean A. Irvine
 */
public class A068488 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A068488() {
    super(1, new A051342(), Puma::primePiZ);
  }
}

