package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040961 Continued fraction for <code>sqrt(993)</code>.
 * @author Georg Fischer
 */
public class A040961 extends PrependSequence {

  /** Construct the sequence. */
  public A040961() {
    super(new PeriodicSequence(1, 1, 20, 1, 1, 62), Z.valueOf(31));
  }
}
