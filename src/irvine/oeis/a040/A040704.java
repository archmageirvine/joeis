package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040704 Continued fraction for sqrt(732).
 * @author Georg Fischer
 */
public class A040704 extends PrependSequence {

  /** Construct the sequence. */
  public A040704() {
    super(new PeriodicSequence(18, 54), Z.valueOf(27));
  }
}
