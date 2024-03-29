package irvine.oeis.a173;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a046.A046953;
import irvine.oeis.a046.A046954;

/**
 * A173231 a(n) is the n-th number m such that 6*m-1 is composite plus the n-th number k such that 6*k+1 is composite.
 * @author Georg Fischer
 */
public class A173231 extends Sequence1 {

  final Sequence mA046953 = new A046953();
  final Sequence mA046954 = new A046954();
  /** Construct the sequence. */
  public A173231() {
    mA046954.next();
  }
  
  @Override
  public Z next() {
    return mA046953.next().add(mA046954.next());
  }

}
