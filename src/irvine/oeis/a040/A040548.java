package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040548 Continued fraction for sqrt(572).
 * @author Georg Fischer
 */
public class A040548 extends PrependSequence {

  /** Construct the sequence. */
  public A040548() {
    super(new PeriodicSequence(1, 10, 1, 46), Z.valueOf(23));
  }
}
