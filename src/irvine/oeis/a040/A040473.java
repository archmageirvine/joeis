package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040473 Continued fraction for <code>sqrt(496)</code>.
 * @author Georg Fischer
 */
public class A040473 extends PrependSequence {

  /** Construct the sequence. */
  public A040473() {
    super(new PeriodicSequence(3, 1, 2, 4, 1, 1, 2, 2, 2, 1, 1, 4, 2, 1, 3, 44), Z.valueOf(22));
  }
}
