package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040248 Continued fraction for <code>sqrt(265)</code>.
 * @author Georg Fischer
 */
public class A040248 extends PrependSequence {

  /** Construct the sequence. */
  public A040248() {
    super(new PeriodicSequence(3, 1, 1, 2, 2, 1, 1, 3, 32), Z.valueOf(16));
  }
}
