package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040934 Continued fraction for <code>sqrt(966)</code>.
 * @author Georg Fischer
 */
public class A040934 extends PrependSequence {

  /** Construct the sequence. */
  public A040934() {
    super(new PeriodicSequence(12, 2, 2, 2, 12, 62), Z.valueOf(31));
  }
}
