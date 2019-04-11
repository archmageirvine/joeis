package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040437 Continued fraction for <code>sqrt(459)</code>.
 * @author Georg Fischer
 */
public class A040437 extends PrependSequence {

  /** Construct the sequence. */
  public A040437() {
    super(new PeriodicSequence(2, 2, 1, 4, 21, 4, 1, 2, 2, 42), Z.valueOf(21));
  }
}
