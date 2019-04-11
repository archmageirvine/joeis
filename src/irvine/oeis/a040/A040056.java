package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040056 Continued fraction for <code>sqrt(65)</code>.
 * @author Georg Fischer
 */
public class A040056 extends PrependSequence {

  /** Construct the sequence. */
  public A040056() {
    super(new PeriodicSequence(16), Z.valueOf(8));
  }
}
