package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040482 Continued fraction for <code>sqrt(505)</code>.
 * @author Georg Fischer
 */
public class A040482 extends PrependSequence {

  /** Construct the sequence. */
  public A040482() {
    super(new PeriodicSequence(2, 8, 2, 44), Z.valueOf(22));
  }
}
