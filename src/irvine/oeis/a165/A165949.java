package irvine.oeis.a165;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a027.A027762;

/**
 * A165949 a(n) = A027762(n)/A165734(n).
 * @author Georg Fischer
 */
public class A165949 extends Sequence1 {

  final Sequence mA027762 = new A027762();
  final Sequence mA165734 = new A165734();
  @Override
  public Z next() {
    return mA027762.next().divide(mA165734.next());
  }

}
