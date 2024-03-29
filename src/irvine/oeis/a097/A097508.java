package irvine.oeis.a097;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001951;

/**
 * A097508 a(n) = floor(n*(sqrt(2)-1)).
 * @author Georg Fischer
 */
public class A097508 extends Sequence0 {

  final Sequence mA001951 = new A001951();
  protected long mN;
  /** Construct the sequence. */
  public A097508() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return mA001951.next().subtract(Z.valueOf(mN));
  }

}
