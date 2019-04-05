package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040904 Continued fraction for sqrt(935).
 * @author Georg Fischer
 */
public class A040904 extends PrependSequence {

  /** Construct the sequence. */
  public A040904() {
    super(new PeriodicSequence(1, 1, 2, 1, 2, 1, 1, 60), Z.valueOf(30));
  }
}
