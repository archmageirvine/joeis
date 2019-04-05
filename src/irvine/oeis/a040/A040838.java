package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040838 Continued fraction for sqrt(868).
 * @author Georg Fischer
 */
public class A040838 extends PrependSequence {

  /** Construct the sequence. */
  public A040838() {
    super(new PeriodicSequence(2, 6, 19, 2, 19, 6, 2, 58), Z.valueOf(29));
  }
}
