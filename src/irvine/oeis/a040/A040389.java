package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040389 Continued fraction for <code>sqrt(410)</code>.
 * @author Georg Fischer
 */
public class A040389 extends PrependSequence {

  /** Construct the sequence. */
  public A040389() {
    super(new PeriodicSequence(4, 40), Z.valueOf(20));
  }
}
