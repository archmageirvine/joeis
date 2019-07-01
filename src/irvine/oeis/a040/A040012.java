package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040012 Continued fraction for <code>sqrt(17)</code>.
 * @author Georg Fischer
 */
public class A040012 extends PrependSequence {

  /** Construct the sequence. */
  public A040012() {
    super(new PeriodicSequence(8), Z.FOUR);
  }
}
