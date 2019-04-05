package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040889 Continued fraction for sqrt(920).
 * @author Georg Fischer
 */
public class A040889 extends PrependSequence {

  /** Construct the sequence. */
  public A040889() {
    super(new PeriodicSequence(3, 60), Z.valueOf(30));
  }
}
