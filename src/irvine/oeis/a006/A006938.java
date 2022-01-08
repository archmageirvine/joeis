package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006938 Convert the last term from decimal to binary!.
 * @author Sean A. Irvine
 */
public class A006938 implements Sequence {

  protected Z mA;

  /** Construct the sequence. */
  public A006938() {
    this(3);
  }

  /**
   * Generic constructor with parameters
   * @param start
   */
  public A006938(final int start) {
    mA = Z.valueOf(start);
  }

  @Override
  public Z next() {
    final Z result = mA;
    mA = new Z(mA.toString(2));
    return result;
  }
}
