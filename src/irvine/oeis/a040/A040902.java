package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040902 Continued fraction for <code>sqrt(933)</code>.
 * @author Georg Fischer
 */
public class A040902 extends PrependSequence {

  /** Construct the sequence. */
  public A040902() {
    super(new PeriodicSequence(1, 1, 5, 20, 5, 1, 1, 60), Z.valueOf(30));
  }
}
