package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040048 Continued fraction for sqrt(56).
 * @author Georg Fischer
 */
public class A040048 extends PrependSequence {

  /** Construct the sequence. */
  public A040048() {
    super(new PeriodicSequence(2, 14), Z.valueOf(7));
  }
}
