package irvine.oeis.a262;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002704;

/**
 * A262583 <code>a(n) = A002704(n)-2</code>.
 * @author Georg Fischer
 */
public class A262583 implements Sequence {

  final Sequence mA002704 = new A002704();
  /** Construct the sequence. */
  public A262583() {
  }
  
  @Override
  public Z next() {
    return mA002704.next().subtract(Z.TWO);
  }

}
