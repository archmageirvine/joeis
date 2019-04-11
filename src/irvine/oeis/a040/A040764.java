package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040764 Continued fraction for <code>sqrt(793)</code>.
 * @author Georg Fischer
 */
public class A040764 extends PrependSequence {

  /** Construct the sequence. */
  public A040764() {
    super(new PeriodicSequence(6, 4, 6, 56), Z.valueOf(28));
  }
}
