package irvine.oeis.a195;

import irvine.math.z.Z;
import irvine.oeis.a064.A064413;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A195376 Parity of EKG sequence A064413.
 * @author Sean A. Irvine
 */
public class A195376 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A195376() {
    super(new A064413(), k -> k.and(Z.ONE));
  }
}
