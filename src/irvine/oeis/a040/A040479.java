package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040479 Continued fraction for sqrt(502).
 * @author Georg Fischer
 */
public class A040479 extends PrependSequence {

  /** Construct the sequence. */
  public A040479() {
    super(new PeriodicSequence(2, 2, 7, 14, 1, 4, 22, 4, 1, 14, 7, 2, 2, 44), Z.valueOf(22));
  }
}
