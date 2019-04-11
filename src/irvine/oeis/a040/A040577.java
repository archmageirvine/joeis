package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040577 Continued fraction for <code>sqrt(602)</code>.
 * @author Georg Fischer
 */
public class A040577 extends PrependSequence {

  /** Construct the sequence. */
  public A040577() {
    super(new PeriodicSequence(1, 1, 6, 1, 1, 48), Z.valueOf(24));
  }
}
