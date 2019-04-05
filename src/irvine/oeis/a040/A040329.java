package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040329 Continued fraction for sqrt(348).
 * @author Georg Fischer
 */
public class A040329 extends PrependSequence {

  /** Construct the sequence. */
  public A040329() {
    super(new PeriodicSequence(1, 1, 1, 8, 1, 1, 1, 36), Z.valueOf(18));
  }
}
