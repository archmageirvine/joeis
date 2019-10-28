package irvine.oeis.a027;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a003.A003946;

/**
 * A027327 <code>a(n) = Sum_{k=0..m} (k+1) * A026120(n, m-k)}</code>, where <code>m=0</code> for <code>n=0,1; m=n</code> for <code>n &gt;= 2</code>.
 * @author Sean A. Irvine
 */
public class A027327 extends PrependSequence {

  /** Construct the sequence. */
  public A027327() {
    super(new SkipSequence(new A003946(), 2), 1, 3);
  }
}
