package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040255 Continued fraction for sqrt(272).
 * @author Georg Fischer
 */
public class A040255 extends PrependSequence {

  /** Construct the sequence. */
  public A040255() {
    super(new PeriodicSequence(2, 32), Z.valueOf(16));
  }
}
