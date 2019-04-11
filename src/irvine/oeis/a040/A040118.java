package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040118 Continued fraction for <code>sqrt(130)</code>.
 * @author Georg Fischer
 */
public class A040118 extends PrependSequence {

  /** Construct the sequence. */
  public A040118() {
    super(new PeriodicSequence(2, 2, 22), Z.valueOf(11));
  }
}
