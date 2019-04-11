package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040364 Continued fraction for <code>sqrt(384)</code>.
 * @author Georg Fischer
 */
public class A040364 extends PrependSequence {

  /** Construct the sequence. */
  public A040364() {
    super(new PeriodicSequence(1, 1, 2, 9, 2, 1, 1, 38), Z.valueOf(19));
  }
}
