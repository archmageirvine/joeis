package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040294 Continued fraction for sqrt(312).
 * @author Georg Fischer
 */
public class A040294 extends PrependSequence {

  /** Construct the sequence. */
  public A040294() {
    super(new PeriodicSequence(1, 1, 1, 34), Z.valueOf(17));
  }
}
