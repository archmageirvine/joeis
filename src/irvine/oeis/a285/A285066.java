package irvine.oeis.a285;

import irvine.math.z.Z;

/**
 * A285066 Triangle read by rows: T(n, m) = A285061(n, m)*m!, 0 &lt;= m &lt;= n.
 * @author Georg Fischer
 */
public class A285066 extends A285061 {

  protected Z mFact = Z.ONE;

  @Override
  public void addRow() {
    super.addRow();
    mFact = Z.ONE;
  }

  @Override
  public Z next() {
    final Z result = super.next();
    if (mCol > 0) {
      mFact = mFact.multiply(mCol);
    }
    return result.multiply(mFact);
  }
}
