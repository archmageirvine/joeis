package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040849 Continued fraction for sqrt(879).
 * @author Georg Fischer
 */
public class A040849 extends PrependSequence {

  /** Construct the sequence. */
  public A040849() {
    super(new PeriodicSequence(1, 1, 1, 5, 3, 1, 3, 2, 9, 2, 3, 1, 3, 5, 1, 1, 1, 58), Z.valueOf(29));
  }
}
