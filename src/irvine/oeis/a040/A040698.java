package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040698 Continued fraction for <code>sqrt(725)</code>.
 * @author Georg Fischer
 */
public class A040698 extends PrependSequence {

  /** Construct the sequence. */
  public A040698() {
    super(new PeriodicSequence(1, 12, 2, 12, 1, 52), Z.valueOf(26));
  }
}
