package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040963 Continued fraction for <code>sqrt(995)</code>.
 * @author Georg Fischer
 */
public class A040963 extends PrependSequence {

  /** Construct the sequence. */
  public A040963() {
    super(new PeriodicSequence(1, 1, 5, 4, 3, 12, 3, 4, 5, 1, 1, 62), Z.valueOf(31));
  }
}
