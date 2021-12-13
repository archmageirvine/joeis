package irvine.oeis.a005;

import irvine.oeis.transform.InverseBinomialTransformSequence;
import irvine.oeis.a000.A000108;

/**
 * A005043 Riordan numbers: a(n) = (n-1)*(2*a(n-1) + 3*a(n-2))/(n+1).
 * @author Sean A. Irvine
 */
public class A005043 extends InverseBinomialTransformSequence {

  /** Construct the sequence. */
  public A005043() {
    super(new A000108(), 0);
  }
}
