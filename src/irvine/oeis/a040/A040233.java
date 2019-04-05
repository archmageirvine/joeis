package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040233 Continued fraction for sqrt(249).
 * @author Georg Fischer
 */
public class A040233 extends PrependSequence {

  /** Construct the sequence. */
  public A040233() {
    super(new PeriodicSequence(1, 3, 1, 1, 5, 1, 3, 10, 3, 1, 5, 1, 1, 3, 1, 30), Z.valueOf(15));
  }
}
