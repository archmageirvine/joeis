package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040422 Continued fraction for <code>sqrt(444)</code>.
 * @author Georg Fischer
 */
public class A040422 extends PrependSequence {

  /** Construct the sequence. */
  public A040422() {
    super(new PeriodicSequence(14, 42), Z.valueOf(21));
  }
}
