package irvine.oeis.a254;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.a038.A038110;
import irvine.oeis.a038.A038111;

/**
 * A254196 a(n) is the numerator of Product_{i=1..n} (1/(1-1/prime(i))) - 1.
 * @author Georg Fischer
 */
public class A254196 extends Sequence1 {

  final Sequence mA000040 = new A000040();
  final Sequence mA038110 = new A038110();
  final Sequence mA038111 = new A038111();
  /** Construct the sequence. */
  public A254196() {
    mA038111.next();
    mA000040.next();
    mA038110.next();
  }
  
  @Override
  public Z next() {
    return mA038111.next().divide(mA000040.next()).subtract(mA038110.next());
  }

}
