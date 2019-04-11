package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040195 Continued fraction for <code>sqrt(210)</code>.
 * @author Georg Fischer
 */
public class A040195 extends PrependSequence {

  /** Construct the sequence. */
  public A040195() {
    super(new PeriodicSequence(2, 28), Z.valueOf(14));
  }
}
