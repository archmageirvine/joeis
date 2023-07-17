package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051259 Every 25th Fibocyclotomic number.
 * @author Sean A. Irvine
 */
public class A051259 extends A051258 {

  /** Construct the sequence. */
  public A051259() {
    super(1);
  }

  {
    super.next(); // skip 0
  }

  @Override
  public Z next() {
    for (int k = 0; k < 24; ++k) {
      super.next();
    }
    return super.next();
  }
}
