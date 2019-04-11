package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040538 Continued fraction for <code>sqrt(562)</code>.
 * @author Georg Fischer
 */
public class A040538 extends PrependSequence {

  /** Construct the sequence. */
  public A040538() {
    super(new PeriodicSequence(1, 2, 2, 2, 4, 1, 5, 1, 22, 1, 5, 1, 4, 2, 2, 2, 1, 46), Z.valueOf(23));
  }
}
