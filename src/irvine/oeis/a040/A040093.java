package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040093 Continued fraction for <code>sqrt(104)</code>.
 * @author Georg Fischer
 */
public class A040093 extends PrependSequence {

  /** Construct the sequence. */
  public A040093() {
    super(new PeriodicSequence(5, 20), Z.TEN);
  }
}
