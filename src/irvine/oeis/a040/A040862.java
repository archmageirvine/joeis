package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040862 Continued fraction for sqrt(892).
 * @author Georg Fischer
 */
public class A040862 extends PrependSequence {

  /** Construct the sequence. */
  public A040862() {
    super(new PeriodicSequence(1, 6, 2, 14, 2, 6, 1, 58), Z.valueOf(29));
  }
}
