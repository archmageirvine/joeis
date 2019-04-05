package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040219 Continued fraction for sqrt(235).
 * @author Georg Fischer
 */
public class A040219 extends PrependSequence {

  /** Construct the sequence. */
  public A040219() {
    super(new PeriodicSequence(3, 30), Z.valueOf(15));
  }
}
