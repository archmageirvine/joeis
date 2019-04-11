package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040454 Continued fraction for <code>sqrt(476)</code>.
 * @author Georg Fischer
 */
public class A040454 extends PrependSequence {

  /** Construct the sequence. */
  public A040454() {
    super(new PeriodicSequence(1, 4, 2, 10, 2, 4, 1, 42), Z.valueOf(21));
  }
}
