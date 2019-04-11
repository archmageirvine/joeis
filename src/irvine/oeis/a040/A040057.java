package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040057 Continued fraction for <code>sqrt(66)</code>.
 * @author Georg Fischer
 */
public class A040057 extends PrependSequence {

  /** Construct the sequence. */
  public A040057() {
    super(new PeriodicSequence(8, 16), Z.valueOf(8));
  }
}
