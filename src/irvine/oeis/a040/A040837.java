package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040837 Continued fraction for <code>sqrt(867)</code>.
 * @author Georg Fischer
 */
public class A040837 extends PrependSequence {

  /** Construct the sequence. */
  public A040837() {
    super(new PeriodicSequence(2, 4, 29, 4, 2, 58), Z.valueOf(29));
  }
}
