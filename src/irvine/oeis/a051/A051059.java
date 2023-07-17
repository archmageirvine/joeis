package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a048.A048141;

/**
 * A051059 a(n) = A048141(3*n+1).
 * @author Sean A. Irvine
 */
public class A051059 extends A048141 {

  /** Construct the sequence. */
  public A051059() {
    super(0);
  }

  @Override
  public Z next() {
    final Z t = super.next();
    super.next();
    super.next();
    return t;
  }
}
