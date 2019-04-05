package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040276 Continued fraction for sqrt(294).
 * @author Georg Fischer
 */
public class A040276 extends PrependSequence {

  /** Construct the sequence. */
  public A040276() {
    super(new PeriodicSequence(6, 1, 4, 1, 6, 34), Z.valueOf(17));
  }
}
