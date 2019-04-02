package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010176 Continued fraction for sqrt(111).
 * @author Sean A. Irvine
 */
public class A010176 extends PrependSequence {

  /** Construct the sequence. */
  public A010176() {
    super(new PeriodicSequence(1, 1, 6, 1, 1, 20, 1, 1, 6, 1, 1, 20), Z.TEN);
  }
}

