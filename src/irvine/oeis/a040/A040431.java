package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040431 Continued fraction for <code>sqrt(453)</code>.
 * @author Georg Fischer
 */
public class A040431 extends PrependSequence {

  /** Construct the sequence. */
  public A040431() {
    super(new PeriodicSequence(3, 1, 1, 10, 14, 10, 1, 1, 3, 42), Z.valueOf(21));
  }
}
