package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040369 Continued fraction for sqrt(389).
 * @author Georg Fischer
 */
public class A040369 extends PrependSequence {

  /** Construct the sequence. */
  public A040369() {
    super(new PeriodicSequence(1, 2, 1, 1, 1, 1, 2, 1, 38), Z.valueOf(19));
  }
}
