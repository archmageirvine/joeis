package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a006.A006718;

/**
 * A007219 Number of golygons of order 8n (or serial isogons of order 8n).
 * @author Sean A. Irvine
 */
public class A007219 extends A006718 {

  /** Construct the sequence. */
  public A007219() {
    super(1);
  }

  {
    super.next(); // skip 0th term
  }

  @Override
  public Z next() {
    return super.next().divide(4);
  }
}
