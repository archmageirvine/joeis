package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004288 Least positive multiple of n written in base 8 using only 0 and 1.
 * @author Sean A. Irvine
 */
public class A004288 extends A004283 {

  /** Construct the sequence. */
  public A004288() {
    super(0);
  }

  @Override
  protected Z init() {
    return Z.NEG_ONE;
  }

  @Override
  protected int base() {
    return 8;
  }
}
