package irvine.oeis.a031;

import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001476;

/**
 * A031981 <code>a(1) = 1, a(2) = 2, a(n) =</code> smallest number not the sum of cubes of <code>&gt;= 1</code> distinct earlier terms.
 * @author Sean A. Irvine
 */
public class A031981 extends PrependSequence {

  /** Construct the sequence. */
  public A031981() {
    super(new A001476(), 1);
  }
}
