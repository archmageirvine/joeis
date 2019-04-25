package irvine.oeis.a027;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a014.A014665;

/**
 * A027435 Number of distinct products <code>ij</code> with <code>1 &lt;= i &lt;= n, 1 &lt;= j &lt;= n, (i,j)=1</code>.
 * @author Sean A. Irvine
 */
public class A027435 extends PartialSumSequence {

  /** Construct the sequence. */
  public A027435() {
    super(new A014665());
  }
}

