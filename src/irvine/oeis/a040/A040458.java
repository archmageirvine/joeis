package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040458 Continued fraction for sqrt(480).
 * @author Georg Fischer
 */
public class A040458 extends PrependSequence {

  /** Construct the sequence. */
  public A040458() {
    super(new PeriodicSequence(1, 9, 1, 42), Z.valueOf(21));
  }
}
