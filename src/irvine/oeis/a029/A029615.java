package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A029615 Numbers to the right of the central elements of the (2,3)-Pascal triangle A029600 that are different from 3.
 * @author Sean A. Irvine
 */
public class A029615 extends AbstractSequence {

  private final A029614 mSeq1 = new A029614();

  /** Construct the sequence. */
  public A029615() {
    super(1);
  }

  @Override
  public Z next() {
    Z t;
    do {
      t = mSeq1.next();
    } while (Z.THREE.equals(t));
    return t;
  }
}
