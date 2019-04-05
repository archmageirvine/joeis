package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040543 Continued fraction for sqrt(567).
 * @author Georg Fischer
 */
public class A040543 extends PrependSequence {

  /** Construct the sequence. */
  public A040543() {
    super(new PeriodicSequence(1, 4, 3, 4, 1, 46), Z.valueOf(23));
  }
}
