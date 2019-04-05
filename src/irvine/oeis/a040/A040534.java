package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040534 Continued fraction for sqrt(558).
 * @author Georg Fischer
 */
public class A040534 extends PrependSequence {

  /** Construct the sequence. */
  public A040534() {
    super(new PeriodicSequence(1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 46), Z.valueOf(23));
  }
}
