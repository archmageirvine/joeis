package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a027.A027656;
import irvine.oeis.transform.EulerTransform;

/**
 * A035528 Euler transform of A027656(n-1).
 * @author Sean A. Irvine
 */
public class A035528 extends PrependSequence {

  /** Construct the sequence. */
  public A035528() {
    super(new EulerTransform(new A027656()), Z.ZERO);
  }
}

