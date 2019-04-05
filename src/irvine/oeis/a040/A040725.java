package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040725 Continued fraction for sqrt(753).
 * @author Georg Fischer
 */
public class A040725 extends PrependSequence {

  /** Construct the sequence. */
  public A040725() {
    super(new PeriodicSequence(2, 3, 1, 2, 1, 1, 1, 7, 4, 1, 6, 18, 6, 1, 4, 7, 1, 1, 1, 2, 1, 3, 2, 54), Z.valueOf(27));
  }
}
