package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040263 Continued fraction for <code>sqrt(280)</code>.
 * @author Georg Fischer
 */
public class A040263 extends PrependSequence {

  /** Construct the sequence. */
  public A040263() {
    super(new PeriodicSequence(1, 2, 1, 2, 1, 32), Z.valueOf(16));
  }
}
