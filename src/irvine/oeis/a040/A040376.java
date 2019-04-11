package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040376 Continued fraction for <code>sqrt(396)</code>.
 * @author Georg Fischer
 */
public class A040376 extends PrependSequence {

  /** Construct the sequence. */
  public A040376() {
    super(new PeriodicSequence(1, 8, 1, 38), Z.valueOf(19));
  }
}
