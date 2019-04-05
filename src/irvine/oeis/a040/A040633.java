package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040633 Continued fraction for sqrt(659).
 * @author Georg Fischer
 */
public class A040633 extends PrependSequence {

  /** Construct the sequence. */
  public A040633() {
    super(new PeriodicSequence(1, 2, 25, 2, 1, 50), Z.valueOf(25));
  }
}
