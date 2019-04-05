package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040622 Continued fraction for sqrt(648).
 * @author Georg Fischer
 */
public class A040622 extends PrependSequence {

  /** Construct the sequence. */
  public A040622() {
    super(new PeriodicSequence(2, 5, 6, 5, 2, 50), Z.valueOf(25));
  }
}
