package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040952 Continued fraction for sqrt(984).
 * @author Georg Fischer
 */
public class A040952 extends PrependSequence {

  /** Construct the sequence. */
  public A040952() {
    super(new PeriodicSequence(2, 1, 2, 2, 7, 2, 2, 1, 2, 62), Z.valueOf(31));
  }
}
