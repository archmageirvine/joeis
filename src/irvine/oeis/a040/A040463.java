package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040463 Continued fraction for <code>sqrt(486)</code>.
 * @author Georg Fischer
 */
public class A040463 extends PrependSequence {

  /** Construct the sequence. */
  public A040463() {
    super(new PeriodicSequence(22, 44), Z.valueOf(22));
  }
}
