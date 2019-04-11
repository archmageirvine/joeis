package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040712 Continued fraction for <code>sqrt(740)</code>.
 * @author Georg Fischer
 */
public class A040712 extends PrependSequence {

  /** Construct the sequence. */
  public A040712() {
    super(new PeriodicSequence(4, 1, 12, 1, 4, 54), Z.valueOf(27));
  }
}
