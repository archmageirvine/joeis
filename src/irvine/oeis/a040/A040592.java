package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040592 Continued fraction for sqrt(617).
 * @author Georg Fischer
 */
public class A040592 extends PrependSequence {

  /** Construct the sequence. */
  public A040592() {
    super(new PeriodicSequence(1, 5, 4, 2, 1, 6, 2, 2, 6, 1, 2, 4, 5, 1, 48), Z.valueOf(24));
  }
}
