package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040513 Continued fraction for sqrt(537).
 * @author Georg Fischer
 */
public class A040513 extends PrependSequence {

  /** Construct the sequence. */
  public A040513() {
    super(new PeriodicSequence(5, 1, 3, 2, 1, 1, 1, 2, 1, 14, 1, 2, 1, 1, 1, 2, 3, 1, 5, 46), Z.valueOf(23));
  }
}
