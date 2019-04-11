package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040555 Continued fraction for <code>sqrt(580)</code>.
 * @author Georg Fischer
 */
public class A040555 extends PrependSequence {

  /** Construct the sequence. */
  public A040555() {
    super(new PeriodicSequence(12, 48), Z.valueOf(24));
  }
}
