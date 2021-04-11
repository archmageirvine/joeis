package irvine.oeis.a225;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A225872 Expansion of k(q)^3 * k'(q)^2 * (K(q) / (Pi/2))^6 / 64 in powers of q where k(), k'(), K() are Jacobi elliptic functions.
 * @author Sean A. Irvine
 */
public class A225872 extends PrependSequence {

  /** Construct the sequence. */
  public A225872() {
    super(new EulerTransformSequence(new PeriodicSequence(-4, -4, -4, -12), 0), 0);
  }
}
