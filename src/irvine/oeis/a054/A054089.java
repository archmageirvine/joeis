package irvine.oeis.a054;

import irvine.oeis.AlternatingSequence;
import irvine.oeis.a026.A026351;
import irvine.oeis.a026.A026352;

/**
 * A054089 For k &gt;= 1, let p(k)=least h in N not already an a(i), q(k)=p(k)+k, a(2k)=q(k), a(2k+1)=p(k).
 * @author Sean A. Irvine
 */
public class A054089 extends AlternatingSequence {

  /** Construct the sequence. */
  public A054089() {
    super(new A026351(), new A026352().skip(1));
  }
}
