package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040756 Continued fraction for sqrt(785).
 * @author Georg Fischer
 */
public class A040756 extends PrependSequence {

  /** Construct the sequence. */
  public A040756() {
    super(new PeriodicSequence(56), Z.valueOf(28));
  }
}
