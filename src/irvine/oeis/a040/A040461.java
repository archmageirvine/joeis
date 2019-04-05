package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040461 Continued fraction for sqrt(483).
 * @author Georg Fischer
 */
public class A040461 extends PrependSequence {

  /** Construct the sequence. */
  public A040461() {
    super(new PeriodicSequence(1, 42), Z.valueOf(21));
  }
}
