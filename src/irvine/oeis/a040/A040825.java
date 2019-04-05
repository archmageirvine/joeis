package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040825 Continued fraction for sqrt(855).
 * @author Georg Fischer
 */
public class A040825 extends PrependSequence {

  /** Construct the sequence. */
  public A040825() {
    super(new PeriodicSequence(4, 6, 4, 58), Z.valueOf(29));
  }
}
