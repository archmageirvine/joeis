package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a099.A099584;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A068503 Highest power of 3 dividing prime(n)-1.
 * @author Sean A. Irvine
 */
public class A068503 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A068503() {
    super(1, new A099584(), Z.THREE::pow);
  }
}

