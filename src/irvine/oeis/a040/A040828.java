package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040828 Continued fraction for <code>sqrt(858)</code>.
 * @author Georg Fischer
 */
public class A040828 extends PrependSequence {

  /** Construct the sequence. */
  public A040828() {
    super(new PeriodicSequence(3, 2, 3, 58), Z.valueOf(29));
  }
}
