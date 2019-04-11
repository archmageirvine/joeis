package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040504 Continued fraction for <code>sqrt(527)</code>.
 * @author Georg Fischer
 */
public class A040504 extends PrependSequence {

  /** Construct the sequence. */
  public A040504() {
    super(new PeriodicSequence(1, 21, 1, 44), Z.valueOf(22));
  }
}
