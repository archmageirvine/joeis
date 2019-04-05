package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040194 Continued fraction for sqrt(209).
 * @author Georg Fischer
 */
public class A040194 extends PrependSequence {

  /** Construct the sequence. */
  public A040194() {
    super(new PeriodicSequence(2, 5, 3, 2, 3, 5, 2, 28), Z.valueOf(14));
  }
}
