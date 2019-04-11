package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040008 Continued fraction for <code>sqrt(12)</code>.
 * @author Georg Fischer
 */
public class A040008 extends PrependSequence {

  /** Construct the sequence. */
  public A040008() {
    super(new PeriodicSequence(2, 6), Z.valueOf(3));
  }
}
