package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010227.
 * @author Sean A. Irvine
 */
public class A010227 extends PrependSequence {

  /** Construct the sequence. */
  public A010227() {
    super(new PeriodicSequence(1, 1, 1, 1, 26), Z.valueOf(13));
  }
}

