package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040536 Continued fraction for <code>sqrt(560)</code>.
 * @author Georg Fischer
 */
public class A040536 extends PrependSequence {

  /** Construct the sequence. */
  public A040536() {
    super(new PeriodicSequence(1, 1, 1, 46), Z.valueOf(23));
  }
}
