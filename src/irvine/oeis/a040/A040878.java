package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040878 Continued fraction for sqrt(909).
 * @author Georg Fischer
 */
public class A040878 extends PrependSequence {

  /** Construct the sequence. */
  public A040878() {
    super(new PeriodicSequence(6, 1, 2, 6, 2, 1, 6, 60), Z.valueOf(30));
  }
}
