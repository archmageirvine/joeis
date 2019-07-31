package irvine.oeis.a024;

import irvine.oeis.Sequence;
import irvine.oeis.a000.A000217;

/**
 * A024940 Number of partitions of n into distinct triangular numbers <code>C(k,2)</code>.
 * @author Sean A. Irvine
 */
public class A024940 extends A024941 {

  @Override
  protected Sequence seq() {
    return new A000217();
  }
}
