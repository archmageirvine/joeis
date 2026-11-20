package irvine.oeis.a087;

import irvine.math.q.Q;
import irvine.oeis.a086.A086510;

/**
 * A087488 Number of n X n (-1,1)-matrices with all eigenvalues &gt;= 0.
 * @author Sean A. Irvine
 */
public class A087488 extends A086510 {

  /** Construct the sequence. */
  public A087488() {
    super(Q.ONE, Q.NEG_ONE);
  }
}

