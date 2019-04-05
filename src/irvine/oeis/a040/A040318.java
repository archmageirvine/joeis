package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040318 Continued fraction for sqrt(337).
 * @author Georg Fischer
 */
public class A040318 extends PrependSequence {

  /** Construct the sequence. */
  public A040318() {
    super(new PeriodicSequence(2, 1, 3, 1, 11, 2, 4, 1, 3, 3, 1, 4, 2, 11, 1, 3, 1, 2, 36), Z.valueOf(18));
  }
}
