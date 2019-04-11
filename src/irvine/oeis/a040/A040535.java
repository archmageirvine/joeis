package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040535 Continued fraction for <code>sqrt(559)</code>.
 * @author Georg Fischer
 */
public class A040535 extends PrependSequence {

  /** Construct the sequence. */
  public A040535() {
    super(new PeriodicSequence(1, 1, 1, 4, 15, 1, 1, 4, 1, 2, 1, 4, 1, 1, 15, 4, 1, 1, 1, 46), Z.valueOf(23));
  }
}
