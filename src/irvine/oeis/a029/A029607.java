package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A029607 Even numbers in the (2,3)-Pascal triangle A029600 that are different from 2.
 * @author Sean A. Irvine
 */
public class A029607 extends AbstractSequence {

  private final A029605 mSeq1 = new A029605();

  /** Construct the sequence. */
  public A029607() {
    super(1);
  }

  @Override
  public Z next() {
    Z t;
    do {
      t = mSeq1.next();
    } while (Z.TWO.equals(t));
    return t;
  }
}
