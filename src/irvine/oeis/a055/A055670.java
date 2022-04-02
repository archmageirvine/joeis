package irvine.oeis.a055;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a008.A008864;

/**
 * A055670 a(n) = prime(n) - (-1)^prime(n).
 * @author Sean A. Irvine
 */
public class A055670 extends PrependSequence {

  /** Construct the sequence. */
  public A055670() {
    super(new SkipSequence(new A008864(), 1), 1);
  }
}
