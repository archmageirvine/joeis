package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040526 Continued fraction for <code>sqrt(550)</code>.
 * @author Georg Fischer
 */
public class A040526 extends PrependSequence {

  /** Construct the sequence. */
  public A040526() {
    super(new PeriodicSequence(2, 4, 1, 2, 1, 1, 7, 4, 7, 1, 1, 2, 1, 4, 2, 46), Z.valueOf(23));
  }
}
