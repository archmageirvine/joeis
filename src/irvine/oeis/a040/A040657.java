package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040657 Continued fraction for <code>sqrt(684)</code>.
 * @author Georg Fischer
 */
public class A040657 extends PrependSequence {

  /** Construct the sequence. */
  public A040657() {
    super(new PeriodicSequence(6, 1, 1, 12, 1, 1, 6, 52), Z.valueOf(26));
  }
}
