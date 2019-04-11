package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040549 Continued fraction for <code>sqrt(573)</code>.
 * @author Georg Fischer
 */
public class A040549 extends PrependSequence {

  /** Construct the sequence. */
  public A040549() {
    super(new PeriodicSequence(1, 14, 1, 46), Z.valueOf(23));
  }
}
