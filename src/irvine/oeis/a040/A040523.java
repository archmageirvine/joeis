package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040523 Continued fraction for <code>sqrt(547)</code>.
 * @author Georg Fischer
 */
public class A040523 extends PrependSequence {

  /** Construct the sequence. */
  public A040523() {
    super(new PeriodicSequence(2, 1, 1, 2, 1, 2, 1, 7, 15, 2, 6, 5, 23, 5, 6, 2, 15, 7, 1, 2, 1, 2, 1, 1, 2, 46), Z.valueOf(23));
  }
}
