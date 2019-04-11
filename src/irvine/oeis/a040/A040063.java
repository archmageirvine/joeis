package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040063 Continued fraction for <code>sqrt(72)</code>.
 * @author Georg Fischer
 */
public class A040063 extends PrependSequence {

  /** Construct the sequence. */
  public A040063() {
    super(new PeriodicSequence(2, 16), Z.valueOf(8));
  }
}
