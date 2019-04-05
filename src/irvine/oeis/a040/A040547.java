package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040547 Continued fraction for sqrt(571).
 * @author Georg Fischer
 */
public class A040547 extends PrependSequence {

  /** Construct the sequence. */
  public A040547() {
    super(new PeriodicSequence(1, 8, 1, 1, 2, 1, 1, 1, 15, 3, 2, 1, 6, 7, 1, 4, 2, 3, 4, 2, 23, 2, 4, 3, 2, 4, 1, 7, 6, 1, 2, 3, 15, 1, 1, 1, 2, 1, 1, 8, 1, 46), Z.valueOf(23));
  }
}
