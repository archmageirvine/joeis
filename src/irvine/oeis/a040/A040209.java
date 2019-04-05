package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040209 Continued fraction for sqrt(224).
 * @author Georg Fischer
 */
public class A040209 extends PrependSequence {

  /** Construct the sequence. */
  public A040209() {
    super(new PeriodicSequence(1, 28), Z.valueOf(14));
  }
}
