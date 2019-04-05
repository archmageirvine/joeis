package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040726 Continued fraction for sqrt(754).
 * @author Georg Fischer
 */
public class A040726 extends PrependSequence {

  /** Construct the sequence. */
  public A040726() {
    super(new PeriodicSequence(2, 5, 1, 1, 1, 1, 5, 2, 54), Z.valueOf(27));
  }
}
