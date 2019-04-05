package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040241 Continued fraction for sqrt(258).
 * @author Georg Fischer
 */
public class A040241 extends PrependSequence {

  /** Construct the sequence. */
  public A040241() {
    super(new PeriodicSequence(16, 32), Z.valueOf(16));
  }
}
