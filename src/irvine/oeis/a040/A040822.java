package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040822 Continued fraction for sqrt(852).
 * @author Georg Fischer
 */
public class A040822 extends PrependSequence {

  /** Construct the sequence. */
  public A040822() {
    super(new PeriodicSequence(5, 3, 2, 4, 2, 3, 5, 58), Z.valueOf(29));
  }
}
