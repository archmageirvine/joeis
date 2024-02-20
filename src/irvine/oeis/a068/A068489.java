package irvine.oeis.a068;

import irvine.factor.prime.Puma;
import irvine.oeis.a057.A057713;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A068489 m for which prime(m) is the least prime dividing #prime(n) - 1, i.e., one less than primorial n-th prime (A057588).
 * @author Sean A. Irvine
 */
public class A068489 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A068489() {
    super(1, new A057713().skip(), Puma::primePiZ);
  }
}

