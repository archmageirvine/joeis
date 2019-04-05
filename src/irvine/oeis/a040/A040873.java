package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040873 Continued fraction for sqrt(904).
 * @author Georg Fischer
 */
public class A040873 extends PrependSequence {

  /** Construct the sequence. */
  public A040873() {
    super(new PeriodicSequence(15, 60), Z.valueOf(30));
  }
}
