package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040475 Continued fraction for <code>sqrt(498)</code>.
 * @author Georg Fischer
 */
public class A040475 extends PrependSequence {

  /** Construct the sequence. */
  public A040475() {
    super(new PeriodicSequence(3, 6, 22, 6, 3, 44), Z.valueOf(22));
  }
}
