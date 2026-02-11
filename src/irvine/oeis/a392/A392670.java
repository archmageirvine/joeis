package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002487;
import irvine.oeis.a046.A046699;

/**
 * A392670 Triangle read by rows where row n is the numerators of the node values in a preorder traversal of the Calkin-Wilf tree with n levels, columns 0 &lt;= k &lt; 2^n-1.
 * @author Sean A. Irvine
 */
public class A392670 extends Sequence1 {

  private final DirectSequence mStern = new A002487();
  private final Sequence mA = new A046699().skip();

  @Override
  public Z next() {
    return mStern.a(mA.next());
  }
}
