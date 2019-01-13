package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010184.
 * @author Sean A. Irvine
 */
public class A010184 extends PrependSequence {

  /** Construct the sequence. */
  public A010184() {
    super(new PeriodicSequence(1, 9, 1, 20), Z.TEN);
  }
}

