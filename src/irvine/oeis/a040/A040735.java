package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040735 Continued fraction for sqrt(763).
 * @author Georg Fischer
 */
public class A040735 extends PrependSequence {

  /** Construct the sequence. */
  public A040735() {
    super(new PeriodicSequence(1, 1, 1, 1, 1, 5, 1, 1, 17, 1, 6, 1, 17, 1, 1, 5, 1, 1, 1, 1, 1, 54), Z.valueOf(27));
  }
}
