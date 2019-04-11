package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040887 Continued fraction for <code>sqrt(918)</code>.
 * @author Georg Fischer
 */
public class A040887 extends PrependSequence {

  /** Construct the sequence. */
  public A040887() {
    super(new PeriodicSequence(3, 2, 1, 6, 30, 6, 1, 2, 3, 60), Z.valueOf(30));
  }
}
