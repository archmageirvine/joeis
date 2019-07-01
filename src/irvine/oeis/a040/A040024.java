package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040024 Continued fraction for <code>sqrt(30)</code>.
 * @author Georg Fischer
 */
public class A040024 extends PrependSequence {

  /** Construct the sequence. */
  public A040024() {
    super(new PeriodicSequence(2, 10), Z.FIVE);
  }
}
