package irvine.oeis.a039;
// Generated by gen_seq4.pl seqop a173 A173490 divide(2) 1 at 2020-01-25 22:40
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a173.A173490;

/**
 * A039725 Even abundant numbers divided by 2.
 * @author Georg Fischer
 */
public class A039725 extends A173490 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
