package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040890 Continued fraction for <code>sqrt(921)</code>.
 * @author Georg Fischer
 */
public class A040890 extends PrependSequence {

  /** Construct the sequence. */
  public A040890() {
    super(new PeriodicSequence(2, 1, 6, 1, 11, 3, 1, 2, 2, 3, 1, 1, 1, 1, 1, 8, 20, 8, 1, 1, 1, 1, 1, 3, 2, 2, 1, 3, 11, 1, 6, 1, 2, 60), Z.valueOf(30));
  }
}
