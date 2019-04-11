package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040472 Continued fraction for <code>sqrt(495)</code>.
 * @author Georg Fischer
 */
public class A040472 extends PrependSequence {

  /** Construct the sequence. */
  public A040472() {
    super(new PeriodicSequence(4, 44), Z.valueOf(22));
  }
}
