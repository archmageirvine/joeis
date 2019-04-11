package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040151 Continued fraction for <code>sqrt(164)</code>.
 * @author Georg Fischer
 */
public class A040151 extends PrependSequence {

  /** Construct the sequence. */
  public A040151() {
    super(new PeriodicSequence(1, 4, 6, 4, 1, 24), Z.valueOf(12));
  }
}
