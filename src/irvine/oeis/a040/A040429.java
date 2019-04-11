package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040429 Continued fraction for <code>sqrt(451)</code>.
 * @author Georg Fischer
 */
public class A040429 extends PrependSequence {

  /** Construct the sequence. */
  public A040429() {
    super(new PeriodicSequence(4, 4, 2, 8, 21, 8, 2, 4, 4, 42), Z.valueOf(21));
  }
}
