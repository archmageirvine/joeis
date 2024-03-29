package irvine.oeis.a163;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a033.A033676;
import irvine.oeis.a033.A033677;

/**
 * A163520 a(n) is the least integer x such that n &lt; x and the product n*x is divisible by an integer y where n &lt; y &lt; x.
 * @author Georg Fischer
 */
public class A163520 extends Sequence1 {

  final Sequence mA033676 = new A033676();
  final Sequence mA033677 = new A033677();
  protected long mN;
  /** Construct the sequence. */
  public A163520() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).add(mA033676.next()).add(mA033677.next()).add(Z.ONE);
  }

}
