package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040226 Continued fraction for <code>sqrt(242)</code>.
 * @author Georg Fischer
 */
public class A040226 extends PrependSequence {

  /** Construct the sequence. */
  public A040226() {
    super(new PeriodicSequence(1, 1, 3, 1, 14, 1, 3, 1, 1, 30), Z.valueOf(15));
  }
}
