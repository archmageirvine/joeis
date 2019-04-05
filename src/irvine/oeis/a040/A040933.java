package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040933 Continued fraction for sqrt(965).
 * @author Georg Fischer
 */
public class A040933 extends PrependSequence {

  /** Construct the sequence. */
  public A040933() {
    super(new PeriodicSequence(15, 1, 1, 15, 62), Z.valueOf(31));
  }
}
