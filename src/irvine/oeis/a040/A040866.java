package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040866 Continued fraction for sqrt(896).
 * @author Georg Fischer
 */
public class A040866 extends PrependSequence {

  /** Construct the sequence. */
  public A040866() {
    super(new PeriodicSequence(1, 13, 1, 58), Z.valueOf(29));
  }
}
