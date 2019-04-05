package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040300 Continued fraction for sqrt(318).
 * @author Georg Fischer
 */
public class A040300 extends PrependSequence {

  /** Construct the sequence. */
  public A040300() {
    super(new PeriodicSequence(1, 4, 1, 34), Z.valueOf(17));
  }
}
