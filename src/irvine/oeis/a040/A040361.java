package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040361 Continued fraction for sqrt(381).
 * @author Georg Fischer
 */
public class A040361 extends PrependSequence {

  /** Construct the sequence. */
  public A040361() {
    super(new PeriodicSequence(1, 1, 12, 1, 1, 38), Z.valueOf(19));
  }
}
