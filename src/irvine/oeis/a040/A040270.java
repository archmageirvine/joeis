package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040270 Continued fraction for sqrt(287).
 * @author Georg Fischer
 */
public class A040270 extends PrependSequence {

  /** Construct the sequence. */
  public A040270() {
    super(new PeriodicSequence(1, 15, 1, 32), Z.valueOf(16));
  }
}
