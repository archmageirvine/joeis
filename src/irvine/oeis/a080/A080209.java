package irvine.oeis.a080;

import irvine.oeis.a005.A005384;
import irvine.oeis.transform.GilbreathTransformSequence;

/**
 * A080209 Gilbreath transform of the sequence of Sophie Germain primes (A005384), i.e., the diagonal of leading successive absolute differences of A005384.
 * @author Sean A. Irvine
 */
public class A080209 extends GilbreathTransformSequence {

  /** Construct the sequence. */
  public A080209() {
    super(1, new A005384());
  }
}

