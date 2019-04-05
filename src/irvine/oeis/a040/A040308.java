package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040308 Continued fraction for sqrt(327).
 * @author Georg Fischer
 */
public class A040308 extends PrependSequence {

  /** Construct the sequence. */
  public A040308() {
    super(new PeriodicSequence(12, 36), Z.valueOf(18));
  }
}
