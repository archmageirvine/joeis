package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040946 Continued fraction for <code>sqrt(978)</code>.
 * @author Georg Fischer
 */
public class A040946 extends PrependSequence {

  /** Construct the sequence. */
  public A040946() {
    super(new PeriodicSequence(3, 1, 1, 1, 30, 1, 1, 1, 3, 62), Z.valueOf(31));
  }
}
