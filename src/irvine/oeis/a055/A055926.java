package irvine.oeis.a055;

import irvine.oeis.UnionSequence;
import irvine.oeis.a073.A073762;
import irvine.oeis.a232.A232743;

/**
 * A055926 Numbers k such that {largest m such that 1, 2, ..., m divide k} is different from {largest m such that m! divides k}; numbers k which are either odd multiples of 12 or the largest m such that (m-1)! divides k is a composite number &gt; 5.
 * @author Sean A. Irvine
 */
public class A055926 extends UnionSequence {

  /** Construct the sequence. */
  public A055926() {
    super(new A073762(), new A232743());
  }
}
