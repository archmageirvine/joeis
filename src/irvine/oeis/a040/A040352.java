package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040352 Continued fraction for <code>sqrt(372)</code>.
 * @author Georg Fischer
 */
public class A040352 extends PrependSequence {

  /** Construct the sequence. */
  public A040352() {
    super(new PeriodicSequence(3, 2, 12, 2, 3, 38), Z.valueOf(19));
  }
}
