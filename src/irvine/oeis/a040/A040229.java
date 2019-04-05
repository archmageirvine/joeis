package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040229 Continued fraction for sqrt(245).
 * @author Georg Fischer
 */
public class A040229 extends PrependSequence {

  /** Construct the sequence. */
  public A040229() {
    super(new PeriodicSequence(1, 1, 1, 7, 6, 7, 1, 1, 1, 30), Z.valueOf(15));
  }
}
