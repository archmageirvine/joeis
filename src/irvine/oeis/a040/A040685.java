package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040685 Continued fraction for <code>sqrt(712)</code>.
 * @author Georg Fischer
 */
public class A040685 extends PrependSequence {

  /** Construct the sequence. */
  public A040685() {
    super(new PeriodicSequence(1, 2, 6, 2, 1, 52), Z.valueOf(26));
  }
}
