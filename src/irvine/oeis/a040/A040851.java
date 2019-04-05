package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040851 Continued fraction for sqrt(881).
 * @author Georg Fischer
 */
public class A040851 extends PrependSequence {

  /** Construct the sequence. */
  public A040851() {
    super(new PeriodicSequence(1, 2, 7, 11, 1, 2, 1, 3, 1, 4, 1, 1, 1, 1, 4, 1, 3, 1, 2, 1, 11, 7, 2, 1, 58), Z.valueOf(29));
  }
}
