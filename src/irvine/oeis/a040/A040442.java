package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040442 Continued fraction for <code>sqrt(464)</code>.
 * @author Georg Fischer
 */
public class A040442 extends PrependSequence {

  /** Construct the sequence. */
  public A040442() {
    super(new PeriodicSequence(1, 1, 5, 1, 1, 1, 5, 1, 1, 42), Z.valueOf(21));
  }
}
