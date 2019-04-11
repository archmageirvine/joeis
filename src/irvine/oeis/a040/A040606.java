package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040606 Continued fraction for <code>sqrt(632)</code>.
 * @author Georg Fischer
 */
public class A040606 extends PrependSequence {

  /** Construct the sequence. */
  public A040606() {
    super(new PeriodicSequence(7, 6, 7, 50), Z.valueOf(25));
  }
}
