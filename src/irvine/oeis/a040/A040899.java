package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040899 Continued fraction for <code>sqrt(930)</code>.
 * @author Georg Fischer
 */
public class A040899 extends PrependSequence {

  /** Construct the sequence. */
  public A040899() {
    super(new PeriodicSequence(2, 60), Z.valueOf(30));
  }
}
