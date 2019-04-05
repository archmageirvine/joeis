package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040286 Continued fraction for sqrt(304).
 * @author Georg Fischer
 */
public class A040286 extends PrependSequence {

  /** Construct the sequence. */
  public A040286() {
    super(new PeriodicSequence(2, 3, 2, 1, 1, 1, 1, 1, 2, 3, 2, 34), Z.valueOf(17));
  }
}
