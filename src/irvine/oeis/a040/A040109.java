package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040109 Continued fraction for <code>sqrt(120)</code>.
 * @author Georg Fischer
 */
public class A040109 extends PrependSequence {

  /** Construct the sequence. */
  public A040109() {
    super(new PeriodicSequence(1, 20), Z.valueOf(10));
  }
}
