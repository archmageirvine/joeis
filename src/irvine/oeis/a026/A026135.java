package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a025.A025179;

/**
 * A026135 Number of <code>(s(0),s(1),...,s(n))</code> such that every <code>s(i)</code> is a nonnegative integer, <code>s(0) = 1, |s(1) - s(0)| = 1, |s(i) - s(i-1)| &lt;= 1</code> for i <code>&gt;= 2</code>. Also sum of numbers in row <code>n+1</code> of the array T defined in <code>A026120</code>.
 * @author Sean A. Irvine
 */
public class A026135 implements Sequence {

  private final Sequence mS = new PrependSequence(new A025179(), 1);
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    final Z t = mA;
    mA = mS.next();
    return mA.add(t);
  }
}
